package square;

// Dave Ghidiu

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO 
		// 
		// 1. Create a Scanner!
		// 2. Create a variable called something like 'side'
		// 3. Ask the user for the length of the side of a square
		// 4. Store that number in 'side'
		// 5. Display the perimeter of the square
		// 6. Display the area of the square


		
		// Create a scanner because you need a scanner to
		// read input from the keyboard.
		Scanner scanner = new Scanner(System.in);
		
		// Declare a variable where you can store the number
		// that the user enters
		int side;
		
		// Ask the user for the length of the square
		System.out.print("Enter the length of the square: ");
		
		// Store what they typed into the variable names 'side'
		side = scanner.nextInt();

		// Create a blank line - ya' know, just so the program
		// looks nice when it runs
		System.out.println();
		
		// Output the perimeter
		System.out.println("The perimeter of the square is " + (side*4));
		
		// Output the area
		System.out.println("The area of the square is " + (side*side));
		
		// Close the scanner
		// We don't need to, but it's nice to
		scanner.close();
	}
}
