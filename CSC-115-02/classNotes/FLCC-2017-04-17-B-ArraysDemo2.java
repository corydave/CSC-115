package examples;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {

		double[] numbers = new double[100000];
		Scanner bob = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
//			System.out.print("Enter a number: ");
//			numbers[i] = bob.nextInt();
			
			numbers[i] = (int)(Math.random()*1000);
			
		}

		// OUTPUT VALUES IN THE ARRAY (REAL PRETTY-LIKE)
//		System.out.print("[");
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println("]");
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
	}

}


/*
PROJECT: P08-ArrayLab
PACKAGE: arrayLab
CLASS: ArrayLab

1. Create an array of size 10 - it can hold ints
2. Ask the user to input numbers in it (one by one)
3. Output the numbers (in the biz, we call this "echo")
4. Spit out the MAX number
5. Spit out the MIN number
6. Spit out the average of all the numbers
7. Display the array sorted
*/









