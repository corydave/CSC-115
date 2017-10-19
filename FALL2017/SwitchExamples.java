import java.util.*;

public class SwitchExamples {

   public static void main (String args[]) {
    
    // Create a Scanner so we can get input from the user
      Scanner scanner = new Scanner(System.in);
    // #MacLeod #thereCanBeOnlyOne #trigger
    
    // Output a welcome message!
      System.out.println("WELCOME TO THE FUN MACHINE");  
      int choice = 0;
    
    // insert loop here!
      while(choice != 4) {
      
       // Output the menu
         displayMenu();
      
       // Prompt user to make a choice
         System.out.print("\nPick a number: ");
       
       // Store input from user into 'choice'
         choice = scanner.nextInt();
         System.out.println();
       
         switch (choice) {
         
            case 1:
               knockKnock();
               break;
            case 2:
               fortune();
               break;         
            case 3:
               randomNumber();
               break;         
            case 4:
               System.out.println("\nGAME OVER MAN!");
               return;
            default:
               System.out.println("IDIOT! Pick a number 1-4");
         }
       
         System.out.println();
      }

   }

   public static void displayMenu() {
      System.out.println("\t1. Knock-knock joke");
      System.out.println("\t2. Fortune");
      System.out.println("\t3. Random number");
      System.out.println("\t4. QUIT");
   }
  
   public static void knockKnock() {
   
      System.out.println("ME: KNOCK-KNOCK");
      System.out.println("DAD: Who's there?");
      System.out.println("ME: Banana");
      System.out.println("DAD: C'mon in, Mr. Banana!");
   
   }
  
   public static void fortune() {
   
    // A fine example of a "method stub"
      System.out.println("fortune() STUB");
   
   }
  
   public static void randomNumber() {
    
      System.out.println("randomNumber() STUB");
    
   }

}
