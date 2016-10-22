package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Please enter the second number: ");
		int num2 = scanner.nextInt();

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

		System.out.print("Your choice: ");
		scanner.nextLine();
		String choice = scanner.nextLine();
		choice = choice.toUpperCase();

		switch (choice) {
		case "A":
			System.out.println("The sum of " + num1 + " and " + num2 + " is "
					+ (num1 + num2));
			break;
		case "B":
			System.out.println("The difference of " + num1 + " and " + num2
					+ " is " + (num1 - num2));
			break;
		case "C":
			System.out.println("The product of " + num1 + " and " + num2
					+ " is " + (num1 * num2));
			break;
		case "D":
			if (num2 != 0) {
				System.out.println("The quotient of " + num1 + " and " + num2
						+ " is " + (1.0*num1 / num2));
			} else {
				System.out
						.println("ERROR! You cannot divide by zero!\nInvoking Computer.explode()");
			}
			break;
		case "E":
			if (num2 != 0) {
				System.out.println("The modulo of " + num1 + " and " + num2
						+ " is " + (num1 % num2));
			} else {
				System.out
						.println("ERROR! You cannot divide by zero!\nInvoking Computer.explode()");
			}
			break;
		case "F":
			System.out.println("When " + num1 + " is raised to the " + num2
					+ ", the answer is " + (Math.pow(num1, num2)));
			break;
		case "G":
			System.out.println("The bigger of the two numbers is "
					+ (Math.max(num1, num2)));
			break;
		default:
			System.out.println("INVALID CHOICE");
		}
		
		scanner.close();

	}
}
