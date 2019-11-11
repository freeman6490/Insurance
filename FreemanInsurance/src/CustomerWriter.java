import java.util.*;
import java.beans.XMLEncoder;
import java.io.*;
import org.json.simple.*;
public class CustomerWriter {
	public static boolean writeCustomersToTextFile(String fileName, ArrayList<Customer> result) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
			for (Customer c : result) {
				pw.println(c);
			}
			pw.close();
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	public static boolean writeCustomersToBinary(String fileName, ArrayList<Customer> result) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(result);;
			oos.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public static boolean writeCustomersToXML(String fileName, ArrayList<Customer> result) {
		try {
			XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
			enc.writeObject(result);
			enc.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public static boolean writeCustomersToJSON(String fileName, ArrayList<Customer> result) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			JSONObject cusObj;
			JSONArray array = new JSONArray();
			for (Customer cus : result) {
				cusObj = new JSONObject();
				cusObj.put("first name", cus.getFirstName());
				cusObj.put("last name", cus.getLastName());
				cusObj.put("age", cus.getAge());
				cusObj.put("height", cus.getHeight());
				cusObj.put("weight", cus.getWeight());
				cusObj.put("sys BP", cus.getSysBP());
				cusObj.put("dia BP", cus.getDiaBP());
				cusObj.put("cancer", cus.getCancer());
				cusObj.put("diabetes", cus.getDiabetes());
				cusObj.put("alzheimers", cus.getAlzheimers());
				array.add(cusObj);
			}
			JSONObject outer = new JSONObject();
			outer.put("customers", array);
			
			pw.println(outer.toJSONString());
			pw.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}