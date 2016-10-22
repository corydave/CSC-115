package stringLab;

import java.util.Scanner;

// Dave Ghidiu
public class StringLab {

	public static void main(String[] args) {

		// Capture the phrase from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a phrase: ");
		String phrase = scanner.nextLine();

		// Display the menu
		System.out.println();
		System.out.println("1. Find the length of the string");
		System.out.println("2. Perform charAt");
		System.out.println("3. Perform compareTo");
		System.out.println("4. Perform equals");
		System.out.println("5. Perform indexOf");
		System.out.println("6. Perform substring");
		System.out.println("7. Perform toLowerCase");
		System.out.println("8. Perform toUpperCase");
		System.out.println();

		// Get the choice from the user
		System.out.print("Please make a selection: ");
		int choice = scanner.nextInt();
		System.out.println();

		// Use a switch statement to decide on the route of the program

		int tempInt = 0;
		String tempString = "";

		switch (choice) {
		case 1:
			System.out.println("The length of the phrase is " + phrase.length()
					+ ".");
			break;
		case 2:
			System.out.print("Enter an index number between 0 and "
					+ (phrase.length() - 1) + ": ");
			tempInt = scanner.nextInt();
			System.out.println("The character at " + tempInt + " is '"
					+ phrase.charAt(tempInt) + "'.");
			break;
		case 3:
			System.out.print("Enter a phrase that will be compared with \""
					+ phrase + "\": ");

			// Bring the scanner down to the next line so it can read the String
			scanner.nextLine();

			// Scan in the data and store it in tempString
			tempString = scanner.nextLine();

			if (phrase.compareTo(tempString) == 0) {
				System.out.println("The two phrases are equivalent.");
			} else if (phrase.compareTo(tempString) < 0) {
				System.out.println("Alphabetically, \"" + phrase + "\""
						+ " comes before the phrase \"" + tempString + "\"");
			} else {
				System.out.println("Alphabetically, \"" + phrase + "\""
						+ " comes after the phrase \"" + tempString + "\"");
			}
			break;
		case 4:
			System.out.print("Enter a phrase that will be compared with \""
					+ phrase + "\": ");

			// Bring the scanner down to the next line so it can read the String
			scanner.nextLine();

			// Scan in the data and store it in tempString
			tempString = scanner.nextLine();

			if (phrase.equals(tempString)) {
				System.out
						.println("The two phrases DO have the same sequence of characters.");
			} else {
				System.out
						.println("The two phrases DO NOT have the same sequence of characters.");
			}

			break;
		case 5:
			System.out.print("Enter a character to search \"" + phrase
					+ "\" for: ");
			scanner.nextLine();
			tempString = scanner.nextLine();

			if (phrase.indexOf(tempString) == -1) {
				System.out.println("The character \'" + tempString
						+ "' is not in the phrase \"This is a test\".");
			} else {
				System.out.println("The first occurrence of the character \'"
						+ tempString + "' is at index "
						+ phrase.indexOf(tempString));
			}
			break;
		case 6:
			System.out
					.print("Choose one of the methods:\n\t1. Create a substring from a selected index until the end\n\t2. Create a substring from a selected index until another selected index\n\nEnter selection here: ");
			tempInt = scanner.nextInt();
			if (tempInt == 1) {
				System.out.print("Which index (between 0 and "
						+ (phrase.length() - 1)
						+ ") would you like to start with? ");
				tempInt = scanner.nextInt();
				System.out.println("The new phrase is: "
						+ phrase.substring(tempInt));
			} else {
				System.out.print("Which index (between 0 and "
						+ (phrase.length() - 1)
						+ ") would you like to start with? ");
				tempInt = scanner.nextInt();
				System.out.print("Which index (between " + tempInt + " and "
						+ (phrase.length() - 1)
						+ ") would you like to start with? ");
				int tempInt2 = scanner.nextInt();
				System.out.println("The new phrase is: "
						+ phrase.substring(tempInt, tempInt2));
			}
			break;
		case 7:
			System.out.println("All lowercase looks like: "
					+ phrase.toLowerCase());
			break;
		case 8:
			System.out.println("All uppercase looks like: "
					+ phrase.toUpperCase());
			break;
		default:
			System.out.println("You chose... poorly...!");
			break;
		}
		
		scanner.close();
		
	}

}
