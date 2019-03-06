import java.util.Scanner;
import java.util.Random;

public class IfElseDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random vivian = new Random();
        
        // Generate a number between -10 and 10 (inclusive)
        // System.out.println(vivian.nextInt(21)-10);

        int secretNumber = vivian.nextInt(100) + 1;
        
        System.out.println("DEBUG: secretNumber = " + secretNumber);
        System.out.println("Please guess a number between 1 and 100:");        
        int guess = scanner.nextInt();
        
        // With a whole bunch of IF statements, one OR MORE of
        // these can execute
        
        if (secretNumber == guess) {
            System.out.println("YOU WIN!");
        }
        
        if (secretNumber > guess) {
            System.out.println("You guessed too low.");
        }
        
        if (secretNumber < guess) {
            System.out.println("You guessed too high.");
        }

        System.out.println("\n---------------------------\n");
        
        // If-Else
        // At MOST, ONE of these will execute
        
        System.out.println("Enter a grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 60) {
            System.out.println("C");
        } else if (grade >= 50) {
            System.out.println("D");
        } else {
            System.out.println("YOU FAILED");
        }   
        
        System.out.println("\n---------------------------\n");        
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if (number > 5 && number < 20) {
            System.out.println("That's a good number.");
        } else {
            System.out.println("That's a bad number.");
        }
        
        if (number == 6 || number == 28 || number == 496) {
            System.out.println("That's a PERFECT number");
        }
        
        // Short-circuit evaluation
        if (number > 10 || number/0 == 4) {
            System.out.println("OR");
        }
        
        if (number == 11 && number/0 == 5) {
            System.out.println("AND");
        }
        
        // AND (&&) has prescedence over OR (||)
        if (number > 10 || number < 20 && number > 30) {
            System.out.println("I have no idea");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\n\nGAME OVER MAN!");
        
    }
}




















