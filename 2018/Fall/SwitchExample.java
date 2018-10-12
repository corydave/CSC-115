import java.util.Scanner;

public class SwitchExample {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please look at the following menu:");
        
        System.out.println("\t1. Output an insult");
        System.out.println("\t2. Output a complement");
        System.out.println("\t3. Output a warning");
        
        System.out.println();
        System.out.println("Please enter a selection:");
        
        int choice = scanner.nextInt();
        
        // double choice = scanner.nextDouble(); // INSTANT FAILURE/DEATH WILL RESULT
        
        switch (choice) { // Can't be a DOUBLE - has to be INT or STRING
        
            case 1: System.out.println("You stink");
                    break;
                    
            case 2: System.out.println("You're amazing!");
                    break;
                    
            case 3: System.out.println("Beware!");
                    System.out.println("The Skeleton Army is coming!");
                    break;
                    
            default: System.out.println("This computer will self-destruct.");
                     System.out.println("...implement java.util.explode()");
                     break;
        }
        
        System.out.println("\nHave a good day.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
