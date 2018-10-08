import java.util.Scanner;

public class If {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the insult generator!");
        System.out.println();
        
        System.out.println("Are you OK being insulted? (y/n)");
        String choice = scanner.nextLine();
        
        /*
        
        IF ELSE STATEMENT - One of the conditions will trigger
        
        */
        
        if (choice.equalsIgnoreCase("y")) {

            System.out.println("Your feet smell like stinky, moldy cheese (but not the good kind).");
            
        } else {
            
            System.out.println("Your feet smell even worse than stinky cheese!");
            
        }
        
        System.out.println("\n\nYou are the weakest link. Goodbye.");
              
    }
    
}
