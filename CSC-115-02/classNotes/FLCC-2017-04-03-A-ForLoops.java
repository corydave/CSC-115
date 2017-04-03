package examples;

import java.util.Scanner;

public class forLoopsExample {

	public static int j = 100;

	public static void main(String args[]) {
		int i = 10;
		boolean flag = true;

		Scanner morty = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = morty.nextLine();

		System.out.print("\nEnter a character to count: ");
		String character = morty.nextLine();
		char charToCount = character.charAt(0);

		System.out.println("sentence = " + sentence);
		System.out.println("charToCount = " + charToCount);
		System.out.println();

		// Walk through 'sentence' and count how many
		// times 'charToCount' appears

		int counter = 0;

		for (int j = 0; j < sentence.length(); j++) {

			if (charToCount == sentence.charAt(j)) {
				counter++;
			}

			System.out.println(forLoopsExample.j);
			
		}

		System.out.print("j = " + j);

		System.out.println("There are " + counter + " occurences.");

		// for ( ; flag == true; ) {
		//
		// System.out.println(i);
		// i++;
		// if (i > 100) {
		// flag = false;
		// }
		// }

		// for (i = 1; i <= 100; i*=2) {
		// // i = 0 is the INITIALIZER
		// // i <= 100 is the TERMINATOR
		// // i++ is the INCREASINATOR
		//
		// System.out.println(i);
		// }

		// System.out.print("DEBUG: i = " + i);

		// while (i <= 100) {
		// System.out.println(i);
		// i++;
		// }

	}

}
