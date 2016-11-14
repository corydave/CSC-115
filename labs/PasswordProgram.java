package passwordProgram;

import java.util.Scanner;
import java.util.Random;

public class PasswordProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int choice = displayMenu();

		switch (choice) {
		case -1:
			System.out.println("Debugging: displayMenu() has not been finished yet.");
			break;
		case 1:
			showPasswordSpecifications();
			break;
		case 2:
			System.out.print(generateRandomPassword());
			break;
		case 3:
			System.out.print("Enter a password to test: ");
			scanner.nextLine();
			String input = scanner.nextLine();
			if (verifyPasswordSpecifications(input) == true) {
				System.out.println("Your password is valid.");
			} else {
				System.out.println("INVALID");
			}
			break;
		default:
			System.out.println("Sorry! That was an invalid option.");
			break;
		}

		scanner.close();

	}

	static int displayMenu() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: An integer value is returned to the main program.
		//
		// This method must display the menu of options (as per the
		// specifications)
		// and then ask the user to enter a number and take that value and
		// return it to
		// the main program.

		return -1; // This return statement will need to be changed
	}

	static String generateRandomPassword() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: A password that satisfies the specifications is
		// generated
		// and displayed on the screen.
		//
		// This method will display on the screen a password that subscribes to
		// the following
		// criteria:
		// 1. There are at least eight characters in the password
		// 2. There are at least two digits (0-9) in the password
		// 3. At least one of the characters is capitalized
		
		return "DEBUGGING: generateRandomPassword"; // This will need to be changed
	}

	static void showPasswordSpecifications() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: The specifications for a valid password are
		// displayed on the screen
		//
		// This method will simply display the password specifications on the
		// screen. The
		// specifications are:
		// 1. There are at least eight characters in the password
		// 2. There are at least two digits (0-9) in the password
		// 3. At least one of the characters is capitalized
	}

	static boolean verifyPasswordSpecifications(String input) {
		// PRE-CONDITIONS: The main program will pass in a String
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid
		// password, as per the specifications. "false" will be returned
		// otherwise
		//
		// This method needs to check that all the conditions of a password are
		// met
		// in the proposed password, "input"
		//
		// The specifications are:
		// 1. There are at least eight characters in the password
		// 2. There are at least two digits (0-9) in the password
		// 3. At least one of the characters is capitalized

		return false; // This will need to be changed
	}

}
