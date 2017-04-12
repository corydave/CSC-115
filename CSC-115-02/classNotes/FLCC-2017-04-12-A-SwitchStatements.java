package examples;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

		Scanner borat = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int choice = borat.nextInt();

		switch (choice) {

		case 1:
			System.out.println("You chose the first number!");
			break;
		case 2:
			System.out.println("You chose the only even prime.");
			break;
		case 3:
			System.out.println("You chose the first odd prime.");
			break;
		case 4:
			System.out
					.println("You chose the first non-trivial perfect square of a positive number.");
			break;
		case 5:
			System.out
					.println("You chose the number of fingers on a human hand that doesn't have polydactyly.");
			break;
		default:
			System.out.println("Oops. You bwoke it.");
		}

//		if (choice == 1) {
//			System.out.println("You chose the first number!");
//		} else if (choice == 2) {
//			System.out.println("You chose the only even prime.");
//		} else if (choice == 3) {
//			System.out.println("You chose the first odd prime.");
//		} else if (choice == 4) {
//			System.out
//					.println("You chose the first non-trivial perfect square of a positive number.");
//		} else if (choice == 5) {
//			System.out
//					.println("You chose the number of fingers on a human hand that doesn't have polydactyly.");
//		} else {
//			System.out.println("Oops. You bwoke it.");
//		}

	}

}
