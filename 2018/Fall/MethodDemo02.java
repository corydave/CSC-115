import java.util.Scanner;
import java.util.Random;

// noSplodePleeeeze
// TODO: Insult Dennis at some point today

public class MethodDemo02 {
    public static void main (String[] args) {
        
        doSomething(); // No parameters with no RETURN
        
        
        int age = showAge(); // No parameters with RETURN
        
        
        int result = addTwoNumbers(3, 4); // Parameters with RETURN
        System.out.println(result);
        
        
        // System.out.println(addTwoNumbers(3, 4));
        
        
        
    }
    
    public static int addTwoNumbers(int num1, int num2) {
        
        return (num1 + num2);
        
    }
    
    
    public static int showAge() {
        
        return 40;
        
    }
    
    
    
    
    
    
    
    
    
    public static void doSomething() {
        
        System.out.println("This method does something");
        
    }
}






















