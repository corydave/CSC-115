import java.util.Random;
import java.util.Scanner;

// #noSpoldyPlease

public class Password {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a choice: ");
        System.out.println("  1. Display the rules");
        System.out.println("  2. Validate a password");
        System.out.println("  3. Generate a password");
        System.out.println();
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1: displayRules();
                    break;
            
            case 2: scanner.nextLine();
                    System.out.println("Enter a password to verify:");
                    String password = scanner.nextLine();
        
                    if (verifyPassword(password) == true) {
                        System.out.println("Your password is good to use.");   
                    } else {
                        System.out.println("Your password is CRAP!");
                        System.out.println("Initiate 'splode sequence.");
                    }
                    break;
            
            case 3: System.out.println("Your password is: " + generatePassword());
                    break;
            
            default: System.out.println("ID 10 T issue.");

        }

        System.out.println("\nGAME OVER MAN!!!!");
        
    }
    
    public static String generatePassword() {
        
        Random random = new Random();
        
        String pw = "";
        
        while (verifyPassword(pw) == false) {
            pw += (char)(random.nextInt(90) + 33);
            System.out.println(pw);
        }

        return pw;
        
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
        // Are there at least two UPPERCASE letters?
        // Are there at least two LOWERCASE letters?
        // http://www.asciitable.com/
        
        for (int i = 0; i < pw.length(); i++) {
            
            char temp = pw.charAt(i);
            int tempValue = (int)temp;
            
            if (tempValue >= 48 && tempValue <= 57) {
                numberCounter++;
            }

            if (tempValue >= 65 && tempValue <= 90) {
                capsCounter++;
            }

            if (tempValue >= 97 && tempValue <= 122) {
                lowerCounter++;
            }            

        }
        
        if (numberCounter >= 1 && capsCounter >= 2 && lowerCounter >= 2) {
            return true;
        } else {
            return false;
        }

        
    }
    
    
    public static void displayRules() {
        
        System.out.println("There needs to be:");
        System.out.println("  At least eight characters");
        System.out.println("  Two uppercase letters");
        System.out.println("  Two lowercase letters");
        System.out.println("  One number");
        
    }
    
}





























