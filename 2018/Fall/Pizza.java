// no 'splode'
// Dave Ghidiu
// CSC-115
// This program is a Pizza Deal Figure-outer

import java.util.Scanner;

public class Pizza {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the tasty pizza comparison machine");
        System.out.println();
        
        System.out.println("The choices for the first pizza deal are:");
        System.out.println("  1. circular");
        System.out.println("  2. rectangular");
        System.out.println("Please choose:");
        
        int choice = scanner.nextInt();
        
        // System.out.println("choice = " + choice); // Output the STATE of variables
        
        System.out.println();
        
        int diameter;
        int length;
        int width;
        int numberOfPizzas;
        double dealPrice;
        double ppipDealOne = 0;
        double ppipDealTwo = 0;
        

        if (choice == 1) {
            
            System.out.println("What is the diameter of the pizza?");
            diameter = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How many circular pizzas are there?");
            numberOfPizzas = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How much does this deal cost?");
            dealPrice = scanner.nextDouble();
            
            // double radius = diameter/2;
            // double area = 3.14*radius*radius;
            
            ppipDealOne = dealPrice/(numberOfPizzas*(3.14*(diameter/2)*(diameter/2)));
            
        } else if (choice == 2) {
            
            System.out.println();
            
            System.out.println("What is the length of the pizza in inches?");
            length = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("What is the width of the pizza in inches?");
            width = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How many rectangular pizzas are there?");
            numberOfPizzas = scanner.nextInt();
            
            System.out.println("");
            
            System.out.println("How much does this deal cost?");
            dealPrice = scanner.nextDouble();
            
            ppipDealOne = dealPrice/(numberOfPizzas*length*width);            

        } else {
            System.out.println("ID10T Issue.");
        }
        
        System.out.println("Thanks for the information!");
        System.out.println("Let's talk about the second pizza.");
        
        System.out.println("");
        
        System.out.println("The choices for the second pizza deal are:");
        System.out.println("  1. circular");
        System.out.println("  2. rectangular");
        System.out.println("Please choose:");
        
        choice = scanner.nextInt();
        
        System.out.println();
        
        if (choice == 1) {
            
            System.out.println("What is the diameter of the pizza?");
            diameter = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How many circular pizzas are there?");
            numberOfPizzas = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How much does this deal cost?");
            dealPrice = scanner.nextDouble();

            ppipDealTwo = dealPrice/(numberOfPizzas*(3.14*(diameter/2)*(diameter/2)));
            
        } else if (choice == 2) {
            
            System.out.println();
            
            System.out.println("What is the length of the pizza in inches?");
            length = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("What is the width of the pizza in inches?");
            width = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("How many rectangular pizzas are there?");
            numberOfPizzas = scanner.nextInt();
            
            System.out.println("");
            
            System.out.println("How much does this deal cost?");
            dealPrice = scanner.nextDouble();
            
            ppipDealTwo = dealPrice/(numberOfPizzas*length*width);

        } else {
            System.out.println("ID10T Issue.");
        }

        System.out.println("");
        System.out.println("Thank you! Please wait while I determine the best pizza value.");

        
        
        if (ppipDealOne > ppipDealTwo) {
            
        }
























        
        
        
        
        
        
        
        System.out.println("GAME OVER MAN!");
        
        
    }

}












