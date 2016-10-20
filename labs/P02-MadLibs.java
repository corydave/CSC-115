package madLibs;

import java.util.Scanner;

// Dave Ghidiu

public class MadLibs {
	public static void main(String[] args) {

		// Create a scanner so we can read input!
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for 12 words and then load them
		// into the appropriate variables
		System.out.print("Please enter a verb: ");
		String verb1 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a noun: ");
		String noun1 = scanner.nextLine();
		System.out.println();
		
		System.out.print("Please enter a name: ");
		String name = scanner.nextLine();
		System.out.println();
		
		System.out.print("Please enter a store name: ");
		String storeName = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a emotion: ");
		String emotion = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a noun: ");
		String noun2 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a verb: ");
		String verb2 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a color: ");
		String color = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter an adverb: ");
		String adverb1 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter an adjective: ");
		String adjective1 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a noun: ");
		String noun3 = scanner.nextLine();
		System.out.println();

		System.out.print("Please enter a noun: ");
		String noun4 = scanner.nextLine();
		System.out.println();
		System.out.println();

		// Output the title of the MadLib!
		System.out.println();
		System.out.println("=================================================");
		System.out.println("We're So Forgetful!");
		System.out.println("=================================================");
		System.out.println();

		// Output the story!

		System.out.println("The other day, I was going to go " + verb1 + " but I could not find\nmy " + noun1
				+ ". This was problematic, because " + name + " was waiting for me at the\n" + storeName
				+ " and I didn't want to make anyone " + emotion + ". Happily, I was able to find my\n" + noun1
				+ "! It was right where I left it - on top of the " + noun2 + ". Once I met up with\n" + name
				+ ", we decided to go " + verb2 + " instead with the " + color
				+ " Pokemon. They were fun,\nbut they moved too " + adverb1 + " for us. So we instead went to the "
				+ adjective1 + " movie\ntheater. It was there that " + name + " lost the " + noun3
				+ ". We couldn't find it\nfor hours, but we got a phone call later that day, and the theater\nowners said they had found the "
				+ noun3 + " in the " + noun4 + "! We are too silly!");

		scanner.close();
	}

}
