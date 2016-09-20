package dorkingAround;

import java.util.Scanner;


public class SalesTax {

	public static void main(String[] args) {

		// Declare SALES_TAX to be .075
		// Prompt the user for a dollar amount (dollars and cents)
		// Display the sales tax
		// Display the total
		
		final double SALES_TAX = .075;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a dollar amount: ");
		double amount = scanner.nextDouble();
		
		double amountOfTax = amount * SALES_TAX;
		
		System.out.println("The sales tax is $" + amountOfTax);
		System.out.println("The total is $" + (amountOfTax + amount));
	}

}









