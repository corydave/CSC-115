import java.util.*;

public class PassValidate {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a password: ");
        String input = scanner.nextLine();
        
        if (verifyPasswordSpecifications(input) == true) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        
        
    }
    
    public static boolean verifyPasswordSpecifications(String input) {

        // 1. 8 or greater characters
        // 2. One capital letter
        // 3. Two numbers
        
        if (input.length() < 8) {
            return false;
        }
        
        // -------------------- Check for ONE capital letter -------------------
        int counter = 0;
        int capitalCounter = 0;
        
        while (counter < input.length()) {
            
            char temp = input.charAt(counter);
            
            if (temp >= 'A' && temp <= 'Z') {
                capitalCounter++;
            }
        
            counter++;
        }
        // -------------------- End check for ONE capital letter ---------------
        
        
        
        // -------------------- Check for TWO numbers --------------------------
        
        counter = 0;
        int numberCounter = 0;
        
        while (counter < input.length()) {
            
            char temp = input.charAt(counter);
            
            if (temp >= '0' && temp <= '9') {
                numberCounter++;
            }
        
            counter++;
        }
        
        // -------------------- End check for TWO numbers ----------------------
        
        
        if ((capitalCounter >= 1) && (numberCounter >=2)) {
            return true;
        }
        
        return false;
        
        
        
        
        
        
        
        
        
        
    }
}




















































