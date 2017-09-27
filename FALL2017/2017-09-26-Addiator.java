import java.util.Scanner;

public class Addiator{

     public static void main(String []args){
        
        // Create a new scanner
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.print("Enter first number: ");
        
        // Store first number in 'first'
        double first = scanner.nextDouble();
        
        // Go to the next Line
        System.out.println();
        
        // Prompt user for second number
        System.out.print("Enter second number: ");
        
        // Store second number in 'second'
        double second = scanner.nextDouble();
        
        // Go to the next Line
        System.out.println();
        
        // Output the sum
        System.out.println(first + second);
        
     }
}
