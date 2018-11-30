import java.util.Random;
import java.util.Scanner;

// #noSpoldyPlease

public class Password {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // displayMenu();
        
        
        System.out.println("Enter a password to verify:");
        String password = scanner.nextLine();
        
        if (verifyPassword(password) == true) {
            System.out.println("Your password is good to use.");   
        } else {
            System.out.println("Your password is CRAP!");
            System.out.println("Initiate 'splode sequence.");
        }
        
    }
    
    public static boolean verifyPassword(String pw) {
        
        // Does the password have at least 8 characters?
        if (pw.length() < 8) {
            return false;
        }
        
        int numberCounter = 0;
        int capsCounter = 0;
        int lowerCounter = 0;
        
        
        // Is there at least one NUMBER in the password?
        for (int i = 0; i < pw.length(); i++) {
            
            char temp = pw.charAt(i);
            int tempValue = (int)temp;
            if (tempValue >= 48 && tempValue <= 57) {
                numberCounter++;
            }
            
            
            
        }
        
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        // Are there at least two UPPERCASE letters?
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    public static void displayMenu() {
        
        System.out.println("There needs to be:");
        System.out.println("  At least eight characters");
        System.out.println("  Two uppercase letters");
        System.out.println("  Two lowercase letters");
        System.out.println("  One number");
        
    }
    
}





























