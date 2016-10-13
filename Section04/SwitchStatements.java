import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		if (name.equals("Dave")) {
			System.out.println("YOU ROCK!");
			System.out.println("Seriously. You rock");
		} else if (name.equals("John")) {
			System.out.println("You smell!");
		} else if (name.equals("Jeremy")) {
			System.out.println("Random F");
		} else {
			System.out.println("Does not compute");
		}

		switch (name) {
		case "Dave":
			System.out.println("YOU ROCK");
			System.out.println("Seriously");
			break;
		case "John":
			System.out.print("You smell");
			break;
		case "Jeremy":
			System.out.println("Random F");
			break;
		default:
			System.out.println("Does not compute");
			break;
		}
		
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		switch (age) {
		
		case 4:
			System.out.println("Hi, toddler.");
			break;
		case 12:
			System.out.println("Hi, pre-teen.");
			break;
		
		}

	}

}
