package passwordProgram;
import java.util.Scanner;
import java.util.Random;

public class PasswordProgram {

	public static void main(String[] args) {
		
		Scanner logan = new Scanner(System.in);
		
		System.out.println("Welcome to Pass-O-Matic\n");
		displayMenu();
		
		int choice = logan.nextInt();
		
		if (choice == 1) {
			
			displayPasswordRules();
			
		} else if (choice == 2) {
			
			String pass = generateRandomPassword();
			System.out.println("The password is: " + pass);
			
		} else if (choice == 3) {
			
			System.out.print("Enter a password: ");
			logan.nextLine();
			String test = logan.nextLine();
			
			boolean isValid = verifyPassword(test);
			
			if (isValid == true) {
				System.out.println("YEAH! It is valid!");
			} else {
				System.out.println("Ya screwed up!");
			}
		
		} else {
			
			System.out.println("You didn't choose a valid number.");
			
		}
		
		logan.close();
	}

	public static void displayPasswordRules() {
		System.out.println("The rules for your password are:");
		System.out.println(" 1. It must be at least 8 characters long");
		System.out.println(" 2. It must contain at least 2 numbers");
		System.out.println(" 3. At least one letter must be capitalized");
				
	}
	
	public static String generateRandomPassword() {
		
		Random tuco = new Random();
		String password = "";
		
		int currentLength = 0;
		
		while (!verifyPassword(password)) {
			
			password = "";
			
			while (currentLength < 8) {
				
				password += (char)(tuco.nextInt(75)+48);
	
				currentLength++;
			}
			
			currentLength = 0;
			
		}
		

		return password;
	}
	
	public static boolean verifyPassword(String pass) {
		
		// Deal with length
		if (pass.length() < 8) {
			return false;
		} 
		
		// Deal with UPPERCASE letters
		// Look at each letter, if there is ONE capital
		// letter, we're in business. If there are no
		// capital letters, return FALSE
		
		int capitalCounter = 0;
		int numberCounter = 0;
		int characterCounter = 0;
		
		while (characterCounter < pass.length()) {

			if (pass.charAt(characterCounter) >= 65 && pass.charAt(characterCounter) <= 90) {
				capitalCounter++;
			}

			// Deal with numbers			
			if (pass.charAt(characterCounter) >= 48 && pass.charAt(characterCounter) <= 57) {
				numberCounter++;
			}
			
			characterCounter++;
			
		}
		
		if (numberCounter >= 2 && capitalCounter >= 1) {
			return true;
		}
		
		return false;
		
	}
	
	public static void displayMenu() {
		System.out.println("Here is your menu of options:");
		System.out.println("\t1. See the password rules");
		System.out.println("\t2. Generate a random password");
		System.out.println("\t3. Test the validity of a password");
	}

}
