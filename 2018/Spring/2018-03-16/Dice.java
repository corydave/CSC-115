import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(88);
        
        // int randNum = random.nextInt(6) + 1; // Random number between 1 and 6 (inclusive)
        // System.out.println(randNum);
        
        // randNum = random.nextInt(6) + 1; // Random number between 1 and 6 (inclusive)
        // System.out.println(randNum);

        
        displayRules();
        System.out.println();
        
        int die01 = rollDie();
        System.out.println("Roll 1: " + die01);
        
        int die02 = rollDie();
        System.out.println("Roll 2: " + die02);
        
        System.out.println("For a grand total of " + (die01 + die02));
        
        System.out.println();
        
        int die03 = rollSpecial(12);
        int die04 = rollSpecial(20);
        int die05 = rollSpecial(120);
        
        System.out.println("D-12: " + die03);
        System.out.println("D-20: " + die04);
        System.out.println("D-120: " + die05);

        System.out.println();
        
        int dice = rollDice(2, 20);
        System.out.println("The total is: " + dice);
        
    }
    
    public static int rollDice(int numOfDice, int sides) {
    
        int total = 0;
        int counter = 0;
        
        while (counter < numOfDice) {
            total += rollSpecial(sides);
            counter++;
        }
        
        if (total == 40) {
            System.out.println("WINNER!!!!!");
        }
    
        return total;
        
    }
    
    // Method that takes a parameter and returns a value
    public static int rollSpecial(int sides) {

        Random random = new Random();
        return random.nextInt(sides) + 1;
        
    }
    
    // Method that takes no parameters and returns a value
    public static int rollDie() {
        
        Random random = new Random();
        return random.nextInt(6) + 1;
        
    }
    
    // Method that takes no parameters and returns no value
    public static void displayRules() {
            
        System.out.println("\nRoll one die");
        System.out.println("Roll another die");
        System.out.println("Add the two together");
        System.out.println("That's your score!");
        System.out.println("The highest score wins!");
        
    }
    
    
}

