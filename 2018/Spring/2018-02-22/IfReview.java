/*

 The first section, the uncommented section, is the preferred way to handle a program
 where code is reused. The second version (below the first and commented out) is the
 less preferred way.

 */
 
import java.util.Scanner;

public class IfReview {
    
    public static void main (String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        
        if (age > 65) {
            System.out.println("You're a moldy oldy");
        }
        
        
        
        
        System.out.println(age + " is a good age.");
        
    }
    
}



/*

import java.util.Scanner;

public class IfReview {
    
    public static void main (String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        
        if (age > 65) {
            System.out.println("You're a moldy oldy");
            System.out.println(age + " is a good age.");
        }
        
        if (age <= 65) {
            System.out.println(age + " is a good age.");
        }
     
    }
    
}

*/
