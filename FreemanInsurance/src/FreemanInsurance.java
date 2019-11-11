import java.util.ArrayList;
import java.util.Scanner;
public class FreemanInsurance {
	public static void printWelcome() {
		System.out.println("*************************************");
		System.out.println("Insurance Score Card");
		System.out.println("This app scores a potential customer on ");
		System.out.println("various health attributes; blood pressure,  ");
		System.out.println("age, height, weight, and family history of ");
		System.out.println("disease. It writes each member's insurance ");
		System.out.println("grade to a JSON file so they can be easily ");
		System.out.println("shared on a web based data exchange.");
		System.out.println("*************************************");
	}
	public static void printMenu() {
		System.out.println("Here are your choices");
		System.out.println("1. List members");
		System.out.println("2. Add a new member");
		System.out.println("3. Save members");
		System.out.println("4. Load members");
		System.out.println("5. Assess members");
		System.out.println("6. Save assesments as JSON");
		System.out.println("7. Quit");
		System.out.println("Enter your choice: ");
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		printWelcome();
		int choice, choice2, choice3;
		String fileName2;
		System.out.println("Enter name of file: ");
		String fileName = sc.nextLine();
		ArrayList<Customer> result = CustomerReader.readCustomersFromTextFile(fileName);
				do {
					printMenu();
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println(CustomerReader.readCustomersFromTextFile(fileName));
					} else if (choice == 2) {
						CustomerReader.addMember(result);
						System.out.println("They were added.");
					} else if (choice == 3) {
						System.out.println("Enter your choice: ");
						System.out.println("1. Text");
						System.out.println("2. Binary");
						System.out.println("3. XML");
						choice2 = sc.nextInt();
						if (choice2 == 1) {
							System.out.println("Enter text file name");
							fileName2 = sc.nextLine();
							if (CustomerWriter.writeCustomersToTextFile(fileName, result)) {
								System.out.println("Members were written successfully.");
							} else {
							System.out.println("Could not write customers to text file.");
							}
						} else if (choice2 == 2) {
							System.out.println("Enter binary file name");
							fileName2 = sc.nextLine();
							if (CustomerWriter.writeCustomersToBinary(fileName, result)) {
								System.out.println("Members were written successfully.");
							} else {
								System.out.println("Could not write customers to binary file.");
							}
						} else if (choice2 == 3) {
							System.out.println("Enter XML file name");
							fileName2 = sc.nextLine();
							if (CustomerWriter.writeCustomersToXML(fileName, result)) {
								System.out.println("Members were written successfully.");
							} else {
							System.out.println("Could not write customers to XML file.");
							}
						}
					} else if (choice == 4) {
						System.out.println("Enter your choice: ");
						System.out.println("1. Text");
						System.out.println("2. Binary");
						System.out.println("3. XML");
						choice3 = sc.nextInt();
						if (choice3 == 1) {
							System.out.println("Enter file name");
							fileName = sc.nextLine();
							System.out.println(CustomerReader.readCustomersFromTextFile(fileName)); 
							} else if (choice3 == 2) {
							System.out.println("Enter file name");
							fileName = sc.nextLine();
							System.out.println(CustomerReader.readCustomerFromBinary(fileName));
							} else if (choice3 == 3) {
							System.out.println("Enter file name");
							fileName = sc.nextLine();
						}
					} else if (choice == 5) {
						
					} else if (choice == 6) {
						System.out.println("Enter name of JSON file");
						fileName = sc.nextLine();
						CustomerWriter.writeCustomersToJSON(fileName, result);
						System.out.println("Members were written successfully.");
					}
				} while (choice != 7);
			}
	}

