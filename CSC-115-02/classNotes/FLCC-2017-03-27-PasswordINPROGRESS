package passwordProgram;
import java.util.Scanner;
public class PasswordProgram {

	public static void main(String[] args) {
		
		Scanner logan = new Scanner(System.in);

//		displayMenu();
//		displayPasswordRules();
		
//		generateRandomPassword();
		
		System.out.print("Enter a password: ");
		String test = logan.nextLine();
		verifyPassword(test);
		
		logan.close();
	}

	public static void displayPasswordRules() {
		System.out.println("The rules for your password are:");
		System.out.println(" 1. It must be at least 8 characters long");
		System.out.println(" 2. It must contain at least 2 numbers");
		System.out.println(" 3. At least one letter must be capitalized");
				
	}
	
	public static String generateRandomPassword() {
		System.out.println("STUB: This will output a String");
		return "";
	}
	
	public static boolean verifyPassword(String pass) {
		
		// Deal with length
		if (pass.length() < 8) {
			System.out.println("INVALID: '" + pass + "' Needs to be 8 or more characters.");
			return false;
		} 
		
		// Deal with UPPERCASE letters
		// Look at each letter, if there is ONE capital
		// letter, we're in business. If there are no
		// capital letters, return FALSE
		
		
		if (pass.charAt(0) >= 65 && pass.charAt(0) <= 90) {
			System.out.println("This character is a capital.");
		}
		
		
		// Deal with numbers
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("STUB: This will verify a password.");
		return false;
	}
	
	public static void displayMenu() {
		System.out.println("Here is your menu of options:");
		System.out.println("\t1. See the password rules");
		System.out.println("\t2. Generate a random password");
		System.out.println("\t3. Test the validity of a password");
	}

}
