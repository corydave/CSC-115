// Dave Ghidiu
// Ask the user for a number and tell them if their number
// is odd or even

import java.util.Scanner;


public class IfStatement {
    
    public static void main (String[] args) {

        Scanner sconer = new Scanner(System.in); // Create a Scanner
        System.out.println("Enter a number: "); // Prompts the user
        int number = sconer.nextInt(); // Stores the next input
        
        /*
         * Three big mistakes:
         *   1. DON'T put a rogue ';' after the if()
         *   2. DO remember to put curly braces for the code {}
         *   3. DO remember to test for equality with '=='
         */ 

        if (number % 2 == 0) { // Test for "eveness" by modding by 2
            
            System.out.println("The number " + number + " is even");
            System.out.println("BLERGH!");    
        
        }

        System.out.println("GAME OVER MAN!!!!");

    }
    
}













