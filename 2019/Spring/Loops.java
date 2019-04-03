import java.util.*;

public class Loops {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("TEST");
        
        // FOR LOOPS
        // These are handy when you have a DETERMINED number of
        // iterations.
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("The value of i is " + i);
        // }
        
        // System.out.println("THE VALUE OF i IS NOW " + i);
        
        
        String password = "aaBBB3443";
        //                 012345678               
        
        int capCounter = 0;
        int lowCounter = 0;
        int numCounter = 0;
        
        
        for (int i = 0; i < password.length(); i++) {

            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                capCounter++;
            }
            
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                lowCounter++;
            }
            
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numCounter++;
            }
            
            
        }
        
        System.out.println("There are " + capCounter + " capital letters.");
        System.out.println("There are " + lowCounter + " lowercase letters.");
        System.out.println("There are " + numCounter + " numbers.");
            
            
            // What do we need so we can count
            // the number of capital letters?        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int choice = -1;
        
        // while (choice != 4) {
        
        //     System.out.println("\n\nPlease choose from this menu:");
        //     System.out.println("\t1. Translate 'hi' to Spanish");
        //     System.out.println("\t2. Translate 'four' to Spanish");
        //     System.out.println("\t3. Translate 'bye' to Spanish");
        //     System.out.println("\t4. QUIT");
            
        //     System.out.print("Enter your choice: ");
        //     choice = scanner.nextInt();
            
        //     // System.out.println("choice = " + choice);
            
        //     switch (choice) {
        //         case 1:  System.out.println("Hola");
        //                  break;
        //         case 2:  System.out.println("cuatro");
        //                  break;
        //         case 3:  System.out.println("adios");
        //                  break;
        //         case 4:  System.out.println("Thanks for playing!");
        //                  break;
        //         default: System.out.println("Please choose a valid number.");
        //                  break;
        //     }
        // }
        
        
        System.out.println("\n\nGAME OVER MAN!");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // WHILE LOOP
        // These are handier when you don't know how many times
        // the loop will iterate;

        // int counter = 100;
        
        // while (counter >= 0) {
        //     System.out.println("Counter = " + counter);
        //     counter--;
        // }
        
        // System.out.println("\nCOUNTER IS NOW " + counter);
              
        // while (counter <= 10) {
        //     System.out.println("Counter = " + counter);
        //     counter *= 2;
        // }      
              
              
              
              
              
              
              
              
              
              
              
    }
    
    
}


/*
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);        
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);        
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);        
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);
        counter--;
        System.out.println("Counter = " + counter);        
        counter--;
        System.out.println("Counter = " + counter);        
        counter--;
        System.out.println("Counter = " + counter);  
*/
