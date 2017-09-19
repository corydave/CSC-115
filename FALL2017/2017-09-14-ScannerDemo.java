import java.util.Scanner;

public class ScannerDemo {
  public static void main (String[] args) {
  
   Scanner scanner = new Scanner(System.in);
   
   // Declare three variables
   int age;
   double gpa;
   String name;
   


   // Prompt the user for a value to put into 'age'
   System.out.print("AGE: ");
   
   // Take what the user typed and store it in 'age'
   age = scanner.nextInt();
   
   
    
    

   // Prompt the user for a value to put into 'gpa'    
   System.out.print("GPA: ");
    
   // Take what the user typed and store it in 'gpa'
   gpa = scanner.nextDouble();

    
    
   
   // Need this line IF we "scanned-in" numbers before "scanning-in" a String
   scanner.nextLine();
    
    
    
    
   // Prompt the user for a value to put into 'name'
   System.out.print("NAME: ");
  
   // Take what the user typed and store it in 'name' 
   name = scanner.nextLine();
      
    
    
    
   // Output the variables mixed with String literals (CONCATENATION)
   System.out.print(age + ", " + gpa + ", and " + name);
   
   
   
   
   
   
  
  }
}
