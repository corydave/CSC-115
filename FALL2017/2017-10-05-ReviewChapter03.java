import java.util.Scanner;
import java.lang.Math;


public class ReviewChapter03 {

   public static void main (String args[]) {

      Scanner scanner = new Scanner(System.in);   
      boolean didIWearCrocsThisMorning = true;
   
      final double SALES_TAX = .07;
      
      

      System.out.print("Enter a number: ");
      int temp = scanner.nextInt();
      final int MATT_WANG = temp;
      System.out.println("MATT_WANG = " + MATT_WANG);
      
      // remember to fail Phil...
      
      
      
      
   
      if (didIWearCrocsThisMorning == true) {
         System.out.println("Best day ever");
         System.out.println("Sales Tax = " + SALES_TAX);
      }
   
      char choice = 'B';
      char choice2 = 'C';
   // System.out.println("" + choice + choice2);
      System.out.println(choice + 0); 
   
   

      System.out.println("Sales Tax = " + SALES_TAX);   
   
   /*   
   System.out.print("Enter a number: ");
   int number = scanner.nextInt(); // Declaring AND assigning
   */
   
      int number = 6;
      System.out.println("number = " + number);
      number = 7;
      System.out.println("number = " + number);
      number++;
      System.out.println("number = " + number);
      number--;
      System.out.println("number = " + number); 
      ++number;
      System.out.println("number = " + number);   
      System.out.println(5 + ++number); //pre-fix vs post-fix incrementor
      System.out.println("number = " + number);  
      System.out.println("Sales Tax = " + SALES_TAX);       
   
   
   // number = number+3;
      number += 3;
      
   //       number = number * 3;
   //       number *= 3;
                  
      System.out.println("number = " + number);   
   
      
      
      
      
      
      
      
      
      
      
      System.out.println("Pi = " + Math.PI);
      System.out.println("e = " + Math.E);
   //    int biggerNumber = Math.max(20, 30);  
      System.out.println(Math.max(40, Math.max(20, Math.max(100, 12))));  
   
   
   
   //    int number;
   //    number = scanner.nextInt();
   
   
   
   
   
   
   
   /* Four primitive data types
   int 
   double
   boolean
   char
   
   String is an "object"
   
   */
   
   
   
   
   
   
   }
}
