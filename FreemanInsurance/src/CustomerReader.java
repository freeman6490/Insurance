import java.io.*;
import java.util.*;
public class CustomerReader {
	public static ArrayList<Customer> readCustomersFromTextFile(String fileName){
		try {
			ArrayList<Customer> result = new ArrayList<Customer>();
			Scanner fsc = new Scanner(new File(fileName));
			String line, firstName, lastName, cancer, diabetes, alzheimers;
			int age, height, weight, sysBP, diaBP;
			Customer customer;
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
			}
			fsc.close();
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
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
