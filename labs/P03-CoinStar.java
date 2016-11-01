package coinStar;

import java.util.Scanner;

// Dave Ghidiu

public class CoinStar {

	public static void main(String[] args) {

		// 1. Prompt the user for a number
				// 1013
		// 2. Convert input to dollars and cents
				// $10.13
		// 3. Declare a constant named PERCENT
				// Let's start with 20%
		// 4. Output a message saying how much they
		//    entered, what the percentage is, and
		//    how much they earned (amount - percentage)
		
		final double PERCENT = .20;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many pennies did you insert? ");
		int pennies = scanner.nextInt();
		// Define pennies to be 1013 to aid in debugging
		// int pennies = 1013;
		
		int dollars = pennies / 100;
		int cents = pennies % 100;
		
		double processedPennies = pennies * PERCENT/100;
		double earnedPennies = pennies - processedPennies*100;
		
		System.out.println("You have deposited $" + dollars + "." + cents);
		System.out.println("The processing fee is: $" + processedPennies);
		System.out.println("You earned $" + earnedPennies/100);
		
		scanner.close();
	}
}