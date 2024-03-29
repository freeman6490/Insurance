import java.beans.XMLDecoder;
import java.io.*;
import java.util.*;
public class CustomerReader {
	/**
	 * original file reader. opens up the file and seperates it. adds each part of the 
	 * array to an arraylist using "fsc.next();"
	 * then returns the new customer
	 * @param fileName
	 * @author luke freeman
	 */
	public static ArrayList<Customer> readCustomersFromTextFile(String fileName){
		try {
			ArrayList<Customer> result = new ArrayList<Customer>();
			Scanner fsc = new Scanner(new File(fileName));
			String firstName, lastName, cancer, diabetes, alzheimers;
			int count, age, height, weight, sysBP, diaBP;
			Customer customer;
			count = 0;
			while (fsc.hasNextLine()) {	
				firstName = fsc.next().trim();
				lastName = fsc.next().trim();
				age = fsc.nextInt();
				height = fsc.nextInt();
				weight = fsc.nextInt();
				sysBP = fsc.nextInt();
				diaBP = fsc.nextInt();
				cancer = fsc.next().trim();
				diabetes = fsc.next().trim();
				alzheimers = fsc.next().trim();
				customer = new Customer(firstName, lastName, age, height, weight, sysBP, diaBP, cancer, diabetes, alzheimers);
				result.add(customer);
				count = count + 1;
			}
			fsc.close();
			System.out.printf("%d members were read.\n",count);
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	/**
	 * reads customers in from a binary file and prints them in a human readable manner
	 * @param fileName
	 * @author luke freeman
	 */
	public static ArrayList<Customer> readCustomerFromBinary(String fileName){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			ArrayList<Customer> result = (ArrayList<Customer>)ois.readObject();
			ois.close();
			return result;
		} catch (Exception ex) {
			return null;
		}
	}
	/**
	 * reads cutomers in from an XML file. Needs array list and also a file name 
	 * to do this. have to input XML decoder at the top.
	 * @param fileName
	 * @author luke freeman
	 */
	public static ArrayList<Customer> readCustomerFromXML(String fileName){
		try {
			XMLDecoder dec = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
			ArrayList<Customer> result = (ArrayList<Customer>)dec.readObject();
			dec.close();
			return result;
		} catch (Exception ex) {
			return null;
		}
	}
	/**
	 * let's the user enter their own member and then adds them to memory
	 * option 2
	 * @param result
	 * @author luke freeman
	 */
		public static void addMember(ArrayList<Customer> result) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter first name: ");
			String newFirstName = sc.next().trim();
			System.out.println("Enter last name: ");
			String newLastName = sc.next().trim();
			System.out.println("Enter age: ");
			int newAge = sc.nextInt();
			System.out.println("Enter height: ");
			int newHeight = sc.nextInt();
			System.out.println("Enter weight: ");
			int newWeight = sc.nextInt();
			System.out.println("Enter sys BP: ");
			int newSysBP = sc.nextInt();
			System.out.println("Enter dia BP");
			int newDiaBP = sc.nextInt();
			System.out.println("Cancer? ");;
			String newCancer = sc.next().trim();
			System.out.println("Diabetes? ");
			String newDiabetes = sc.next().trim();
			System.out.println("Alzheimers? ");
			String newAlz = sc.next().trim();
			result.add(new Customer(newFirstName, newLastName, newAge, newHeight, newWeight, newSysBP, newDiaBP, newCancer, newDiabetes, newAlz));
		}
	
}