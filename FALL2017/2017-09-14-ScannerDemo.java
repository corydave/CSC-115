import java.util.Scanner;

public class ScannerDemo {
  public static void main (String[] args) {
  
   Scanner scanner = new Scanner(System.in);
   int age;
   double gpa;
   String name;
   


   System.out.print("AGE: ");
   age = scanner.nextInt();
   
   System.out.print("GPA: ");
   gpa = scanner.nextDouble();

   scanner.nextLine();
      
   System.out.print("NAME: ");
   name = scanner.nextLine();
      
   System.out.print(age + ", " + gpa + ", and " + name);
   
   
   
   
   
   
  
  }
}
