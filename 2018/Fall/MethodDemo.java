import java.util.*;
// #noSplodin' today!
// PSA: Don't deep fry your turkey inside

public class MethodDemo {
    
    public static Random random = new Random();

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi there!");
        
        String again = "yes";
        
        while (again.equalsIgnoreCase("yes")) {

            displayMenu();
            
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("a")) {
                
                randNum();
                
            } else if (choice.equalsIgnoreCase("b")) {
                
                randomOddNumber();
        
            } else if (choice.equalsIgnoreCase("c")) {
    
                splode();
                
            } else {
                System.out.println("\nID 10 T ERROR: NOT LEGAL INPUT\n");
            }
            
            System.out.println("\n\nAgain (yes/no):");
            again = scanner.nextLine();
        
        }
        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void randNum() {
        // System.out.println("random number"); // Stub code
        
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Your random number is " + randomNumber);
        
    }
    
    public static void randomOddNumber() {
        // System.out.println("random odd number"); // Stub code
        int randomNumber = random.nextInt(100) + 1;
        if (randomNumber % 2 == 1) {
            System.out.println("Your random odd number is " + randomNumber);
        } else {
            System.out.println("Your random odd number is " + (randomNumber - 1));
        }
        
    }    
    
    public static void displayMenu() {

        System.out.println("\nMENU");
        System.out.println("\tPress \"a.\" to generate a number.");
        System.out.println("\tPress \"b.\" to generate an odd number.");
        System.out.println("\tPress \"c.\" to EXPLODE.");        
        System.out.println();
        System.out.println("Enter a choice:");
        
    }
    
    public static void splode() {
        while (1 != 0) {
            System.out.println("'splode");
        }
    }
    
    
}




























