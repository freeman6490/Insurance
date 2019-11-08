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
		System.out.println("5. Asses members");
		System.out.println("6. Save assesments as JSON");
		System.out.println("7. Quit");
		System.out.println("Enter your choice: ");
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		printWelcome();
		int choice;
		System.out.println("Enter name of file: ");
		String fileName = sc.nextLine();
		CustomerReader.readCustomersFromTextFile(fileName);
				do {
					printMenu();
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println(CustomerReader.readCustomersFromTextFile(fileName));
					} else if (choice == 2) {
						
					} else if (choice == 3) {
						
					} else if (choice == 4) {
						
					} else if (choice == 5) {
						
					} else if (choice == 6) {
						
					}
				} while (choice != 7);
			}
	}
