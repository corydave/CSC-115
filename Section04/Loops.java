package dorkingAround;

import java.util.Scanner;
import java.util.Random;

public class Loops {

	public static void main(String[] args) {

		char space = ' ';
		char star = '*';
		int cap = 5;

		for (int j = 0; j <= cap; j++) {

			for (int i = 0; i <= cap - j; i++) {
				System.out.print(space);
			}

			for (int i = 0; i <= j; i++) {
				System.out.print(star);
			}

			for (int i = 1; i <= j; i++) {
				System.out.print(star);
			}

			for (int i = 0; i <= 10 - j; i++) {
				System.out.print(space);
			}

			for (int i = 0; i <= 10 - j; i++) {
				System.out.print(space);
			}

			for (int i = 0; i <= j; i++) {
				System.out.print(star);
			}

			for (int i = 1; i <= j; i++) {
				System.out.print(star);
			}

			System.out.println();

		}

		for (int j = 0; j <= cap; j++) {

			for (int i = 0; i <= cap - j; i++) {
				System.out.print(space);
			}

			for (int i = 0; i <= j; i++) {
				System.out.print(space);
			}

			for (int i = 1; i <= j; i++) {
				System.out.print(space);
			}

			for (int i = 0; i <= cap - j; i++) {
				System.out.print(star);
			}

			for (int i = 0; i <= cap - j; i++) {
				System.out.print(star);
			}

			for (int i = 0; i <= j; i++) {
				System.out.print(space);
			}

			for (int i = 1; i <= j; i++) {
				System.out.print(space);
			}

			System.out.println();

		}

		// int counter;
		// int numberOfGuesses = 3;
		//
		// for(counter = 0; counter < numberOfGuesses ; counter++) {
		//
		// System.out.println("*");
		//
		// break;
		//
		//
		// }

		// Scanner scanner = new Scanner(System.in);
		// Random random = new Random();
		//
		// int answer = random.nextInt(100) + 1;
		// System.out.println("RANDOM: " + answer);
		//
		//
		// System.out.print("Guess the number I'm thinking of: ");
		// int guess = scanner.nextInt();
		//
		//
		// while (guess != answer) {
		//
		// if (guess < answer) {
		// System.out.println("You need to guess higher!");
		// } else {
		// System.out.println("You need to guess lower!");
		// }
		//
		// System.out.print("Enter a new guess: ");
		// guess = scanner.nextInt();
		//
		// }
		//
		// System.out.println("Java FTW!!!!");

		// int choice = 0;
		//
		// while (choice != 10) {
		// switch (choice) {
		// case 1:
		// System.out.println("A");
		// choice = 10;
		// break;
		// case 2:
		// System.out.println("B");
		// break;
		// case 3:
		// System.out.println("C");
		// break;
		// }
		// }

		// Scanner scanner = new Scanner(System.in);
		//
		// int guess = 1;
		// int numberOfGuesses = 0;
		//
		// while (numberOfGuesses != 3) {
		//
		// if (guess == 15) {
		//
		// System.out.println("YOU WIN!");
		// break;
		//
		// } else {
		//
		// System.out.print("Guess again: ");
		// guess = scanner.nextInt();
		// numberOfGuesses++;
		// }
		//
		//
		// if (guess == 15) {
		//
		// System.out.println("YOU WIN!");
		// break;
		//
		// }
		// }
		//
		// System.out.println("Game over!");

		// while (true) {
		//
		// System.out.print("How many pennies did you insert? ");
		// int pennies = scanner.nextInt();
		//
		// if (pennies == 0) {
		// break;
		// }
		//
		// int dollars = pennies / 100;
		// int cents = pennies % 100;
		//
		// double processedPennies = pennies * PERCENT/100;
		// double earnedPennies = pennies - processedPennies*100;
		//
		// System.out.println("You have deposited $" + dollars + "." + cents);
		// System.out.println("The processing fee is: $" + processedPennies);
		// System.out.println("You earned $" + earnedPennies/100 +
		// "\n\n-----\n\n");
		//
		//
		// }
		//
		//
		// System.out.println("\n\n\nGAME OVER!");

		// age lotto

		// int guess = 0;
		// Scanner scanner = new Scanner(System.in);
		//
		// while (guess != 15) {
		// System.out.print("Guess a number: ");
		// guess = scanner.nextInt();
		// }
		//
		// System.out.println("\nCongrats! You win!!!!");
		//

		// sentinel!

	}

}
