import java.util.Scanner; // Getting input from user
import java.util.Random; // RANDOM is used to get random numbers

public class StandardClasses {
    
    public static void main (String[] args) {
        
        // showMathMax();
        
        // makeEmptyLines();    
        
        // scannerDemo();
        
        // makeEmptyLines();
        
        randomDemo();
        
        System.out.println("GAME OVER MAN!");
        
    }

    public static void randomDemo() {
        
        Random random = new Random(); // SEED
        System.out.println(random.nextInt());

        // makeEmptyLines();
        // scannerDemo();
        
        System.out.println(random.nextInt(6) + 1); // Capping the max answer to 5 + 1
        
        // System.out.println(random.nextInt(12) + 1);
        // System.out.println(random.nextInt(10) + 1);
        // System.out.println(random.nextInt(4) + 1);
       
    }
    
    public static void showMathMax() {
        
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        System.out.println();
        
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        System.out.println(Math.max(-3, -40));
        
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
        
        System.out.println();
        
        // System.out.println(Math.max(num1, num2, num3)); // Cannot give 3 parameters
        
        System.out.println(Math.max(num1, Math.max(num2, num3)));    
        System.out.println(Math.max(Math.max(1, 2), Math.max(3, 4)));        
        
    }
    
    public static void makeEmptyLines() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
    
    public static void scannerDemo() {

        // Scanner fluffy = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in); // Scanner to read keyboard input
        
        System.out.println("Enter your name:"); // PROMPT the user
        String name = scanner.nextLine(); // STORE their input into a variable
        
        System.out.println("Hello, " + name + "! How are you?");
        
        System.out.println();
        
        System.out.println(name + ", please enter your age:");
        int age = scanner.nextInt();
        
        System.out.println("Ouch! " + age + " is really old!");
        
        System.out.println();
        
        System.out.println("Please enter your GPA:");
        double gpa = scanner.nextDouble();
        
        System.out.println("WOWZERS! You could do better than a " + gpa);
        
        System.out.println();
        
        System.out.println("What is your middle name?");
        scanner.nextLine();
        String middleName = scanner.nextLine();
        
        System.out.println(middleName + " is a sucky name!");
        
        scanner.close();
        
        
    }
    
}


















