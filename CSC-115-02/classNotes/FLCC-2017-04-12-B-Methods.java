package examples;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		
		Scanner jimbo = new Scanner(System.in);
		
		int die01 = diceRoll();
		int die02 = diceRoll();
		
		System.out.print("You've rolled " + die01 + " " + die02);
		
		System.out.println("\n\n---------\n\n");
		
		System.out.print("What size die do you want? ");
		int numberOfSides = jimbo.nextInt();
		
		int die03 = diceRoll(numberOfSides);
		System.out.println("You rolled a " + die03);
		
		System.out.println("\n\n---------\n\n");
		
		int sanityCheck = diceRoll(8, 10);
		System.out.print("You got : " + sanityCheck);
		
		jimbo.close();
		
	}
	
	
	public static int diceRoll() {
		Random bob = new Random();
		int roll = bob.nextInt(6) + 1;
		return roll;
	}
	
	public static int diceRoll(int sides) {
		Random bob = new Random();
		int roll = bob.nextInt(sides) + 1;
		return roll;
	}
	
	public static int diceRoll(int sides, int rolls) {
		int rollCounter = 0;
		int totalValue = 0;
		
		
		while (rollCounter < rolls) {
		
			totalValue += diceRoll(sides);
			rollCounter++;
			
		}
		
		return totalValue;
		
	}
	
	
	
	

}













