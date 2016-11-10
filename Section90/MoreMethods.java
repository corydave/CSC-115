package methods;

import java.util.Scanner;
import java.util.Random;

public class MoreMethods {

	public static void main(String[] args) {
		
		// Scanner scanner = new Scanner(System.in);

		// menu();

		// int rollOne = rollDie();
		// int rollTwo = rollDie();
		//
		// System.out.println(rollOne + " + " + rollTwo + " = " + (rollOne +
		// rollTwo));

		// int rollThree = rollMegaDie(20);
		// int rollFour = rollMegaDie(100);
		//
		// System.out.println(rollThree + " + " + rollFour + " = " + (rollThree
		// + rollFour));

		// System.out.print("Enter the number of sides: ");
		// System.out.println(rollMegaDie(scanner.nextInt()));

		// rollDie(5);

		// int num = 10;
		// System.out.print(num);
		// changeMe(num);
		// System.out.print(num);

	}

	static void jeremy() {
		jeremy();
		// RECURSIVE CALL
	}

	static void changeMe(int num) {
		num = 34;
	}

	static int rollDie(int numberOfThrows) {
		int sum = 0;
		String diceRolls = "";
		for (int i = 0; i < numberOfThrows; i++) {
			int temp = rollDie();
			diceRolls += temp + " ";
			sum += temp;
		}

		System.out.println(diceRolls + " and the sum is " + sum);
		return sum;
	}

	static int rollDie() {
		Random random = new Random();
		int randomNum = random.nextInt(6) + 1;
		return randomNum;
	}

	static int rollMegaDie(int numOfSides) {
		Random random = new Random();
		int randomNum = random.nextInt(numOfSides) + 1;
		return randomNum;
	}

	static void menu() {
		System.out.println();
		System.out.println("Please pick from the following menu of options: ");
		System.out.println("\tA. Add the two numbers");
		System.out.println("\tB. Subtract the two numbers");
		System.out.println("\tC. Multiply the two numbers");
		System.out.println("\tD. Divide the two numbers");
		System.out.println("\tE. Mod the two numbers");
		System.out.println("\tF. Exponentiate the two numbers");
		System.out.println("\tG. Find the maximum of the two numbers");
		System.out.println();
	}

}
