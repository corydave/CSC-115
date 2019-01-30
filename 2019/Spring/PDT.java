// Dave Ghidiu
// 2019-01-30
//
// This program demonstrates the primitive data types
// we will use in Java

public class PDT {
    public static void main (String[] args) {
        
        /*
         A variable is a place to store a value
         There are a few different ways to store information
         
            integer (whole number):    int
            decimal (3.14, 6.0):       double
            boolean (true, false):     boolean
            character ('a', '4', '?'): char
            
            Other types: long, short, float, byte
         
         */
         
         // DECLARING a variable named 'age' that holds
         // whole numbers (integers)
         int age;
         
         // ASSIGNING the variable 'age' a value of '40'
         age = 40;

         
         // DECLARE a variable named 'gpa' that holds
         // decimals and ASSIGN it at the same time!
         double gpa = 3.14;
         
         System.out.println("Your age is " + age + ".");
         System.out.println("Your grade is " + gpa);
         
         // Reassign the value of 'gpa'
         gpa = 2.71828;
         
         System.out.println("Your grade is now " + gpa);
         
         System.out.println();
         
         System.out.println()
         
         
         System.out.println(5/2); // 2
         System.out.println(5.0/2.0); // 2.5
         
         // Mixed-mode arithmetic
         System.out.println(5.0/2); // 2.5
         
         // "Force" the answer to be a double
         System.out.println(1.0*5/2);
        
         System.out.println(5/2*1.0); // 2.0
        
    }
}












