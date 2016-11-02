package dorkingAround;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) { // Number of rows

			for (int j = 0; j < 10 - i; j++) { // Number of "columns"
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			for (int m = 0; m < i; m++) {
				System.out.print("*");
			}

			for (int n = 0; n < 10 - i; n++) {
				System.out.print(" ");
			}

			for (int p = 0; p < 10 - i; p++) {
				System.out.print(" ");
			}

			for (int q = 0; q < i; q++) {
				System.out.print("*");
			}

			for (int r = 0; r < i; r++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// ------------------------------------------------------------

		// for (int i = 1; i < 10; i++) {
		//
		// System.out.println(i);
		//
		// }

		// ------------------------------------------------------------

		// String yesOrNo;
		//
		// int counter = 0;
		//
		// while (counter < 10) {
		// System.out.println("HI!!!! " + counter);
		// counter++;
		// System.out.print("Would you like to play again? (y/n): ");
		// yesOrNo = scanner.nextLine();
		//
		// if (yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("N"))
		// {
		// break;
		// }
		//
		// }

		System.out.println("GAME OVER!");

	}

}
