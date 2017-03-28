package passwordProgram;

public class PasswordProgram {

	public static void main(String[] args) {
		displayMenu();
		
		displayPasswordRules();
		generateRandomPassword();
		verifyPassword();
	}

	public static void displayPasswordRules() {
		System.out.println("STUB: This will display rules");
	}
	
	public static String generateRandomPassword() {
		System.out.println("STUB: This will output a String");
		return "";
	}
	
	public static boolean verifyPassword() {
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
