import java.util.Random;
import java.util.Scanner;

public class JavaClassDemo {
    public static void main (String[] args) {
        
        int base = 2;
        System.out.println("2^5 = " + Math.pow(2,5)); // 32.0
        System.out.println(Math.PI);
        
        String name = "Dave";
        
        System.out.println();
        
        Random random = new Random();
        System.out.println(random.nextDouble());
     
        
        
        // To get input from the user. You need to do like 40 things:
        
        // STEP 1. Manage your expectations
        
        // STEP 2. Create a Scanner that can take input from
        //         the keyboard (kb)
        //         #ThereCanBeOnlyOne
        Scanner scanner = new Scanner(System.in);

        // STEP 3. Question why Java is so complicated
        
        // STEP 4. Prompt the user
        System.out.println("Enter your age:");
        
        // STEP 5: Assign a variable the value that the
        //         user types in
        int age = scanner.nextInt();
        
        System.out.println("Next year you will be " + (age+1) );
        
        
        System.out.println();
        
        System.out.println("Enter your name:");
        
        name = scanner.nextLine();
        
        System.out.println("Hello " + name);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("GAME OVER MAN!");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
     
        
    }
}















