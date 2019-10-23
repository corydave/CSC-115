// Dave Ghidiu
// 2019-10-23
// A demonstration on METHODS


import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main (String[] args) {

        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        displayRules(name);
        
        // dumbIdea();
        // dumbIdea2(rollDie(rng));
        // dumbIdea2(4+5*20);
        
        int die1 = rollDie(rng);
        int die2 = rollDie(rng);
        
        System.out.println("die1 = " + die1);
        System.out.println("die2 = " + die2);
        
        // if (die1 == 1 && die2 == 1) {
        //     System.out.println("SNAKEYES!");
        // } else if (die1 == 6 && die2 == 6) {
        //     System.out.println("BOXCARS!");
        // } else if (die1 == die2) {
        //     System.out.println("DOUBLES!");
        // }        
        
        int d08 = rollDie(rng, 8);
        System.out.println("d08 = " + d08);
        
        int d10 = rollDie(rng, 10);
        System.out.println("d10 = " + d10);
        
        int monopolyRoll = rollTwoDice(rng);
        System.out.println("monopolyRoll = " + monopolyRoll);
        
        int yahtzeeRoll = rollFiveDice(rng);
        System.out.println("yahtzeeRoll = " + yahtzeeRoll);

        int lcrRoll = rollDice(rng, 3);
        System.out.println("lcrRoll = " + lcrRoll);
        
        int hplRoll = rollDice(rng, 8);
        System.out.println("hplRoll = " + hplRoll);

        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void displayRules(String name) {
        
        System.out.println("Hello, " + name + "!");
        
        System.out.println("\n================================");
        System.out.println("STUB: displayRules()");
        System.out.println("================================");
        
    }
    
    /*
       scope is public
       return type: 'int'
       method name: 'rollDie'
       parameters: one Random called 'rng'
     */
     
    public static int rollDie(Random rng) {
        // System.out.println("BLAH");
        int tempRoll = rng.nextInt(6) + 1;
        return tempRoll;
        
    }
    
    // If two or more methods have the same name
    // it is known as "overloading". You can 
    // "overload" as long as the parameter list
    // is different.
    public static int rollDie(Random rng, int sides) {
        
        // System.out.println("You are rolling a " + sides + " sided die");
        
        int tempRoll = rng.nextInt(sides) + 1;
        return tempRoll;
        
    }
    
    public static int rollTwoDice(Random rng) {
        
        return rollDie(rng) + rollDie(rng);
        
        // int temp1 = rollDie(rng);
        // int temp2 = rollDie(rng);
        // return temp1 + temp2;

        // int sum = temp1 + temp2;
        // return sum;
    }
    
    public static int rollFiveDice(Random rng) {
        return rollDie(rng) + rollTwoDice(rng) + rollTwoDice(rng);

    
        // int temp1 = rollDie(rng);
        // int temp2 = rollDie(rng);
        // int temp3 = rollDie(rng);
        // int temp4 = rollDie(rng);
        // int temp5 = rollDie(rng);
        
        // int sum = temp1 + temp2 + temp3 + temp4 + temp5;
        
        // return sum;
    }
    
    public static int rollDice(Random rng, int numOfDice) {
        
        int sum = 0;
        
        for (int i = 0; i < numOfDice; i++) {
            sum += rollDie(rng);
        }
        
        return sum;
        
        // System.out.println("STUB: rollDice(rng, numOfDice");
        // return -1;
    }
    
    public static void dumbIdea2(int x) {
        System.out.println(x);
    }
    
    public static void dumbIdea() {
        displayRules("boooooo");
        displayRules("boooooo");
        displayRules("boooooo");
        displayRules("boooooo");
        displayRules("boooooo");
        displayRules("boooooo");
        displayRules("boooooo");
    }
    
}




































        // int roll = random.nextInt(6) + 1;
        // int roll = (int)((Math.random() * 6) + 1);
