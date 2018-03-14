import java.util.Scanner;

public class MethodDemo {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Enter number 1: ");
        num1 = scanner.nextInt();
        
        System.out.println("Enter number 2: ");
        num2 = scanner.nextInt();
        
        // System.out.println("DEBUG: num1 = " + num1 + " num2 = " + num2);

        // This method is a CODE DISPLACER
        showMenu();
        
        int choice = scanner.nextInt();
        
        // System.out.println("DEBUG: choice = " + choice);
        
        if (choice == 1) {
            
            add(num1, num2); // This method shows how PARAMETERS work

        }
        
        
        if (choice == 4) {
            
            divide(num1, num2);
            
        }

        if (choice == 5) {
            
            int answer = sqr(num1);
            System.out.println(answer);
            
            // System.out.println(sqr(num1));

        }
        
        if (choice == 6) {
            
            System.out.println("The expontentiation is: " + exp(num1, num2));
        }
        

    }
    
    public static int exp(int a, int b) { // This is an advanced thingy
        
        // return Math.pow(a, b);
        
        int counter = 0;
        int answer = 1;
        
        while (counter < b) {
            answer *= a;
            counter++;
        }
        
        return answer;
        
        
    }  // end advanced thingy
    
    
    public static int sqr(int a) {
        
        int square = a * a;
        
        return square;
        
        
        // return a * a;
        
        
    }
    
    
    
    
    
    public static void add(int a, int b) {
        
        System.out.println("The sum of " + a + " + " + b + " is " + (a + b));  

    }
    
    
    
    public static void divide(int a, int b) {
        
        if (b == 0) {
            System.out.println("You can't divide by zero");
        } else {
            System.out.println("The quotient of " + a + "/" + b + " is " + (1.0*a / b));
        }     
        
    }

    
    public static void showMenu() {
        
        System.out.println("\nPlease choose from the following: ");
        System.out.println("\t1. Add the two numbers");
        System.out.println("\t2. Subtract the two numbers");
        System.out.println("\t3. Multiply the two numbers");
        System.out.println("\t4. Divide the two numbers");
        System.out.println("\t5. Square the first number");
        System.out.println("\t6. Exponentiate the two numbers");
        
        System.out.println();
        System.out.println("Enter your choice: ");

    }
    

    
    
}

























