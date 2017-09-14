import java.util.Scanner;

public class IntroToVariables {
   public static void main (String args[]) {
      // prompt the user
      System.out.print("Enter name: ");
   
      // declare a variable
      String firstName;
      
      // "instantiating" a Scanner object
      Scanner mrMeeseeks = new Scanner(System.in);
      
      // load "firstName" with the input stream
      firstName = mrMeeseeks.nextLine();
      
      // output the value of "firstName"
      System.out.print("Hi there, " + firstName.toUpperCase());
      
      // DESTROY the Scanner
      mrMeeseeks.close();
   }
}







    //firstName = "Nick"; // assigning a value to the variable
