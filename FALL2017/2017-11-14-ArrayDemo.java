import java.util.*;

public class ArrayDemo {
  public static void main (String[] args) {
  
   /*
    int grade01 = 100;
    int grade02 = 95;
    int grade03 = 30;
    int grade04 = 34;
    int grade05 = 79;
    .
    .
    .
    int grade77 = 66;
   */ 
   
   // Use arrays when you have lots-of-variables
   
   int[] gradebook = new int[7];
   // This is an array:
   //  1. It is named 'gradebook'
   //  2. It can hold ints
   //  3. It can hold 10 ints
   // 'gradebook' can never hold more than 10 ints
   // 'gradebook' can never hold fewer than 10 ints
  
   System.out.println(gradebook); // [I@659e0bfd

   System.out.println(gradebook[0]);
   System.out.println(gradebook[1]);
   System.out.println(gradebook[2]);
   
   gradebook[4] = 88;

   System.out.println(gradebook[3]);   
   System.out.println(gradebook[4]);
   System.out.println(gradebook[5]);   

   System.out.println("\n------------------\n\n");

   for (int i = 0; i < gradebook.length; i++) {
   
     System.out.println(gradebook[i]);
   
   }
   
   
   Scanner scanner = new Scanner(System.in);
   
   for (int i = 0; i < gradebook.length; i++) {
   
     System.out.print("Enter item #" + i + ": ");
     gradebook[i] = scanner.nextInt();
    
   }

   for (int i = 0; i < gradebook.length; i++) {

     System.out.print(gradebook[i] + " ");

   }
   
   







  
  }
}
