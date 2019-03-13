import java.util.*;

public class MethodDemo {
    public static void main (String[] args) {
        
        
        int c = 10;
        System.out.println("c = " + c);
        changeValue(c);
        System.out.println("c = " + c);
        
        Scanner scanner = new Scanner(System.in);
        
        int a, b;
        System.out.println("Enter two numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        // System.out.println("DEBUG: a = " + a + " b = " + b);
        
        System.out.println("Enter a name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        displayMenu();
        
        System.out.println(add(a, b));
        
        // Method Overloading
        System.out.println(mult(a, b));
        System.out.println(mult(a));
        System.out.println(mult(name));
        
        
        if (b != 0) {
            System.out.println(div(a, b));
        } else {
            System.out.println("Can't divide by zero!");
        }
        
        System.out.println(sub(a, b));
        
        System.out.println("GAME OVER MAN!");
        
        scanner.close();
        
    }

        /*
             _                   _
         ___(_) __ _ _ __   __ _| |_ _   _ _ __ ___
        / __| |/ _` | '_ \ / _` | __| | | | '__/ _ \
        \__ \ | (_| | | | | (_| | |_| |_| | | |  __/
        |___/_|\__, |_| |_|\__,_|\__|\__,_|_|  \___|
               |___/
        */

   //Access          Return   Method  Parameter
   //Modifier        Type     Name    List
    public    static int      add     (int num1, int num2) {
        
        System.out.println("I am preparing to add " + num1 + " and " + num2 +".");
        int sum = num1 + num2;
        return sum;
        
    }
    
    public static int mult(int a, int b) {
        
        // System.out.println("I am preparing to multiply " + a + " and " + b +".");
        // int product = a * b;
        // return product;
        
        return a * b;

    }
    
    public static int mult(int a) {
        
        return (int)(Math.pow(a, a));
        
    }
    
    public static String mult(String a) {
        return "" + a + a;
    }
    
    public static double div (int a, int b) {
        
        return 1.0*a / b;
        
    }
    
    public static int sub (int aa, int bb) {
        
        return aa - bb;
        
    }
    
    public static void changeValue(int c) {
        
        c = 20;
        
    }
    
    public static void displayMenu() {
    
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("Please make a selection.");
    
    }
    
    
    
    
}


















