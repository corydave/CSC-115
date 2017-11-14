import java.util.*;

public class ForLoopExamples {
  public static void main (String args[]) {
  
    // NEEDS 3 things:
    //   1. control variable with a starter value - INITIALIZER
    //   2. condition to test (true/false) - TERMINATOR
    //   3. know when to end - UPDATERIZER
    
//     int i = 1000; // Let's not do this.
    int j = 1000;
    for (int i = 0; i < 10; i++) {
    
      System.out.println("The current value of i is " + i);
      System.out.println("j is " + j);
    }
    
    System.out.println("\n-----------------------\n");
    
    for (int i = 0; i < 10; i+=2) {
    
      System.out.println("The current value of i is " + i);  
    
    }
    
//     System.out.println(i); // ERROR
    
    System.out.println("\n-----------------------\n");    

    for (int i = 0; i < 10; ) {
    
      System.out.println("The current value of i is " + i);  
      i += 4;
    
    }
    
    System.out.println("\n-----------------------\n");    
    
    int k = 1;
    for ( ; ; ) { // Please don't. I can't even.
    
      System.out.println("The current value of k is " + k);  
      k += 4;

      if (k > 9) {
        break;
      }
      
    }    

    System.out.println("\n-----------------------\n");    
    
    System.out.println("The first 10 odd numbers are: ");
    
    for (int i = 1; i < 21; i+=2) {
      System.out.println(i);
    }

    System.out.println("\n-----------------------\n");    
        
    for (int i = 0; i < 10; i++) {
      System.out.println("i is " + i);
      i += 3;
    }

    
    
    
  }
}
