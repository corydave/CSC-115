import java.util.Scanner;
import java.lang.Math;

public class IfStatementExamples {
   public static void main (String args[]) {
      
   //     int num = 10;
   //     
   //     if (6 != num) { // YodaTalk
   //       System.out.println("Winner winner!");
   //     }

      final int ANSWER = (int)(Math.random()*26); // Hardcoding the answer (but we will change it later)
      System.out.println("\n\nDEBUG! The value of ANSWER is " + ANSWER +"\n\n");      


      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a guess (between 0 and 25): ");
      int guess = scanner.nextInt();
      
      
      if (ANSWER == guess) {
         System.out.println("CELEBRATION!");
         System.out.println("It took you one guess");
         return;
      }
   
      if (ANSWER > guess) {
         System.out.println("You need to guess higher.");
      }
      
      if (ANSWER < guess) {
         System.out.println("You need to guess lower.");
      }    
      
      System.out.print("\n\nEnter another guess: ");
      guess = scanner.nextInt();
   
      if (ANSWER == guess) {
         System.out.println("CELEBRATION!");
         System.out.println("It took you two guesses");
         return;
      }
   
      if (ANSWER > guess) {
         System.out.println("You need to guess higher.");
      }
      
      if (ANSWER < guess) {
         System.out.println("You need to guess lower.");
      }        

      System.out.print("\n\nEnter a third guess: ");
      guess = scanner.nextInt();
   
      if (ANSWER == guess) {
         System.out.println("CELEBRATION!");
         System.out.println("It took you three guesses");
         return;
      }
   
      if (ANSWER > guess) {
         System.out.println("You need to guess higher.");
      }
      
      if (ANSWER < guess) {
         System.out.println("You need to guess lower.");
      }        
        
      
      
      
      
      
      
      
      
      
      
   }
}
/*
      if (ANSWER == guess) {
        System.out.println("CELEBRATION!");
        System.out.println("It took you one guess");
        return;
      } else {
        System.out.println("LOSER!!!!!!!");    // include in ELSE statement
      }
*/
