import java.util.Scanner;
import java.util.Random;

public class Password {

	public static void main(String[] args) {

		
		// Create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// Call 'displayMenu()' to show the menu to the user
		displayMenu();
	
		// Read in input from user and assign to 'choice'
		int choice = sc.nextInt();

        // IF-ELSE statements to decide which method to call
		if (choice == 1) {    // display password specifications to the user
		
			showPasswordSpecifications();
		
		} else if (choice == 2) {	// generate a random password for the user
		    
		    	System.out.println("\nYour password is: " + generateRandomPassword(sc));
		    
		} else if (choice == 3) {   // ask the user to input a password and test for validity
		    
		    System.out.println("\nEnter a password to test:");
			sc.nextLine();
			String input = sc.nextLine();
			
			if (verifyPasswordSpecifications(input) == true) {
				
				System.out.println("\nYour password is valid.");
				
			} else {
			    
				System.out.println("\nYour password is NOT valid.");
				
			}
			
		} else {
			
			System.out.println("Sorry! That was an invalid option.");
			
		}

        // close the scanner
		sc.close();

	}

	public static void displayMenu() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: This method displays the menu of options 
		// (as per the specifications)		
		
	    System.out.println("Here is your menu of options:");
    	System.out.println("  1. See the password rules");
	    System.out.println("  2. Generate a random password");
	    System.out.println("  3. Test the validity of a password");
        System.out.println();
        System.out.println("Please make your selection:");

	   // System.out.println("displayMenu() was called.");

	}

	public static String generateRandomPassword(Scanner sc) {  
		// PRE-CONDITIONS: The scanner used to read in the random number generator 
		// seed from the user
		
		// POST-CONDITIONS: A password that satisfies the specifications is
		// generated and returned.
		
		// This method will return a String password that subscribes to
		// the following criteria:
		
		// 1. There are eight characters in the password
		// 2. The first two characters are lowercase letters.
		// 3. The second two characters are uppercase letters.
		// 3. The characters in positions 4 and 5 are numbers.
		// 4. The characters in positions 6 and 7 are any character.

	    System.out.println("\nEnter seed:");
	    int seed = sc.nextInt();
	    Random random = new Random(seed);
	    
	    String tempPass = "";	// this String will become the password
	    
	    tempPass += (char)(random.nextInt(26) + 'a');
	    tempPass += (char)(random.nextInt(26) + 'a');
	    
	    tempPass += (char)(random.nextInt(26) + 'A');
	    tempPass += (char)(random.nextInt(26) + 'A');
	    
	    tempPass += (char)(random.nextInt(10) + '0');
	    tempPass += (char)(random.nextInt(10) + '0');
	    
	    tempPass += (char)(random.nextInt(94) + '!');
	    tempPass += (char)(random.nextInt(94) + '!');
	    
// 		System.out.println("generateRandomPassword(sc) was called.");
        
		return tempPass;

	}

	public static void showPasswordSpecifications() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: The specifications for a valid password are
		// displayed on the screen

        System.out.println("\nThe rules for your password are:");
        System.out.println("  1. It must be at least 8 characters long");
        System.out.println("  2. At least one letter must be capitalized");
        System.out.println("  3. It must contain at least 2 numbers");

// 		System.out.println("showPasswordSpecifications() was called");

	}

	public static boolean verifyPasswordSpecifications(String input) {
		// PRE-CONDITIONS: The main method will pass in a String
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid password, as per the specifications. "false" will be returned otherwise
		//
		// The specifications are:
		// 1. There are at least eight characters in the password
		// 2. At least one of the characters is capitalized
		// 3. There are at least two digits (0-9) in the password

		if (input.length() < 8) {
		    return false;
		}
		
		int capitalCounter = 0;
		int numberCounter = 0;
		int characterPosition = 0;
		
		while (characterPosition < input.length()) {
		    
		    // Test to see if the character is a capital (between 65 and 90)
		    if (input.charAt(characterPosition) >= 65 && input.charAt(characterPosition) <= 90) {
		        capitalCounter++;
		    }
		    
		    // Test to see if the character is a number (between 48 and 57)
		    if (input.charAt(characterPosition) >= 48 && input.charAt(characterPosition) <= 57) {
		        numberCounter++;
		    }
		    
		    characterPosition++;
		}
		
		
// 		System.out.println("You had " + capitalCounter + " capital letters and " + numberCounter + " numbers");
		
		
		
		if (capitalCounter >= 1 && numberCounter >= 2) {
		    return true;
		} else {
		    return false;
		}
    
// 		System.out.println("verifyPasswordSpecifications(" + input + ") was called and 'true' was returned.");

	}

}















