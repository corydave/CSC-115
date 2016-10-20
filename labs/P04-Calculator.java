package calculator;

import java.util.Scanner;

// Dave Ghidiu

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("\nPlease enter the second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.print("\nPlease pick from the following menu of options: ");
		System.out.println("\n\tA. Add the two numbers\n\tB. Subtract the two numbers\n\tC. Multiply the two numbers\n\tD. Divide the two numbers\n\tE. Mod the two numbers\n\tF. Exponentiate the two numbers\n\tG. Find the maximum of the two numbers");
		
		System.out.print("\nYour choice: ");
		scanner.nextLine();
		String choice = scanner.nextLine();
		
		System.out.println();
		
		switch (choice.toUpperCase()) {
		case "A": 
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
			break;
		case "B": 
			System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
			break;
		case "C": 
			System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
			break;
		case "D": 
			if (num2 != 0) {
				System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2));
			} else {
				System.out.println("ERROR! You cannot divide by zero!\nInvoking Computer.explode()");
			}
			break;
		case "E": 
			if (num2 != 0) {
				System.out.println("The modulo of " + num1 + " and " + num2 + " is " + (num1 % num2));
			} else {
				System.out.println("ERROR! You cannot divide by zero!\nInvoking Computer.explode()");
			}
			break;
		case "F": 
			System.out.println("When " + num1 + " is raised to the " + num2 + ", the answer is " + (Math.pow(num1, num2)));
			break;
		case "G": 
			System.out.println("The bigger of the two numbers is " + (Math.max(num1,  num2)));
			break;
		default:
			System.out.println("INVALID CHOICE");
		}
		
		scanner.close();
		
	}
}
