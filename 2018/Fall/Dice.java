import java.util.Scanner;
import java.util.Random;
// 'splosionMan!!!!
// Everybody loves donuts...

public class Dice {
    
    static Random random = new Random(); // Globally accessible
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        displayRules();
        
        System.out.println("How many sides are in the first die?");
        int numOfSides = scanner.nextInt();
        
        int die01 = rollDie(numOfSides); // The parameter here could be named 'sides'
        int die02 = rollDie(); 
        
        System.out.println("\nYour first roll is " + die01 + " and " + 
            "your second roll is " + die02 + ", for a total of " + 
            (die01 + die02) + ".");

        System.out.println();
        
        int twoDice = rollDice(2, 10);
        System.out.println("The total of 'twoDice' is " + twoDice);
            
        System.out.println("\nGAME OVER MAN!!!");        
        
    }
    
    /*
    
    Methods have:
      a name
      a return type
      parameter list
    
    All of this is encapsulated in the "method signature"
    
                  return type    method name   parameter list
    public static int            rollDice      (int numOfDice) 
    */
    
    
    
    // Method that returns an INT and takes 1 parameter
    public static int rollDice(int numOfDice) {
        
        int total = 0;
        
        for (int i = 0; i < numOfDice; i++) {
            
            total += rollDie();
        }
        
        return total;
    }
    
    // Method that returns an INT and takes 2 parameters
    public static int rollDice(int numOfDice, int sides) {
        
        int total = 0;
        
        for (int i = 0; i < numOfDice; i++) {
            
            // total += random.nextInt(sides);
            
            total += rollDie(sides);
            
        }
        
        
        return total;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Method that returns an INT and takes 1 parameter
    public static int rollDie(int sides) {
    
        return random.nextInt(sides) + 1;    
    
    }
    
    
    
    
    
    
    
    
    
    // Method that returns an INT and takes no parameters
    public static int rollDie() {
        
        return random.nextInt(6) + 1;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    // Method that returns NOTHING - it's void - and takes no parameters
    public static void displayRules() {
        System.out.println("\nRoll one die");
        System.out.println("Roll another die");
        System.out.println("Add the two together");
        System.out.println("That's your score!");
        System.out.println("The highest score wins!");
    }
}















