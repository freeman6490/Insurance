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
			String [] customerParts;
			while (fsc.hasNextLine()) {			
				firstName = fsc.next();
				lastName = fsc.next().trim();
				age = fsc.nextInt();
				fsc.nextLine();
				height = fsc.nextInt();
				fsc.nextLine();
				weight = fsc.nextInt();
				fsc.nextLine();
				sysBP = fsc.nextInt();
				fsc.nextLine();
				diaBP = fsc.nextInt();
				fsc.nextLine();
				cancer = fsc.next().trim();
				diabetes = fsc.next().trim();
				alzheimers = fsc.next().trim();
				customer = new Customer(firstName, lastName, age, height, weight, sysBP, diaBP, cancer, diabetes, alzheimers);
				result.add(customer);
				System.out.println("here");
				/*
				line = fsc.nextLine().trim();
			    customerParts = line.split("\t");
			    firstName = customerParts[0].trim();
			    lastName = customerParts[1].trim();
			    age = Integer.parseInt(customerParts[2].trim());
			    height = Integer.parseInt(customerParts[3].trim());
			    weight = Integer.parseInt(customerParts[4].trim());
			    sysBP = Integer.parseInt(customerParts[5].trim());
			    diaBP = Integer.parseInt(customerParts[6].trim());
			    cancer = customerParts[7].trim();
			    diabetes = customerParts[8].trim();
			    alzheimers = customerParts[9].trim();
			    result.add(new Customer(firstName, lastName, age, height, weight, sysBP, diaBP, cancer, diabetes, alzheimers));
			    */
			}
			fsc.close();
			return result;
		} catch (Exception ex) {
			System.out.println("no here");
			return null;
		}
	}
}
