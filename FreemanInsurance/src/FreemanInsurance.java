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
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		printWelcome();
		int choice, choice2, choice3;
		@SuppressWarnings("unused")
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
							System.out.println("Enter file name");
							fileName = sc.next();
							CustomerWriter.writeCustomersToTextFile(fileName, result);
								System.out.println("Members were written successfully.");
						} else if (choice2 == 2) {
							System.out.println("Enter file name");
							fileName = sc.next();
							CustomerWriter.writeCustomersToBinary(fileName, result);
								System.out.println("Members were written successfully.");
							
						} else if (choice2 == 3) {
							System.out.println("Enter file name");
							fileName = sc.next();
							CustomerWriter.writeCustomersToXML(fileName, result);
							System.out.println("Members were written successfully.");
							}
					} else if (choice == 4) {
						System.out.println("1. Text");
						System.out.println("2. Binary");
						System.out.println("3. XML");
						System.out.println("Enter your choice: ");
						choice3 = sc.nextInt();
						if (choice3 == 1) {
							System.out.println("Enter file name");
							fileName = sc.next();
							System.out.println(CustomerReader.readCustomersFromTextFile(fileName)); 
							} else if (choice3 == 2) {
								System.out.println("Enter file name");
								fileName = sc.next();
							System.out.println(CustomerReader.readCustomerFromBinary(fileName));
							} else if (choice3 == 3) {
								System.out.println("Enter file name");
								fileName = sc.next();
							System.out.println(CustomerReader.readCustomerFromXML(fileName));
						}
					} else if (choice == 5) {
						
					} else if (choice == 6) {
						System.out.println("Enter name of JSON file");
						fileName = sc.next();
						CustomerWriter.writeCustomersToJSON(fileName, result);
					}
				} while (choice != 7);
			}
	}