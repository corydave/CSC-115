import java.util.Scanner;

public class If {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the insult generator!");
        System.out.println();
        
        System.out.println("Are you OK being insulted? (y/n)");
        String choice = scanner.nextLine();
        
        /*
        
        IF STATEMENT - Depending on the condition, the code in the IF statement
        may execute, or it may not. Either way, the program continues to the code immediately
        following the IF statement.
        
          - IF statements do NOT get punctuated by a ';'
          - IF statements should have {}
          - IF statements should have all the code inside the brackets indented
        
        */
        
        if (choice.equalsIgnoreCase("y")) {

            System.out.println("Your feet smell like stinky, moldy cheese (but not the good kind).");
            
        }
        
        System.out.println("\n\nYou are the weakest link. Goodbye.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
// char yOrN
