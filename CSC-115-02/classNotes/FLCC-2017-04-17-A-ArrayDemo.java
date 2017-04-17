package examples;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

	
		// Declaring an array of size 10
		int[] numbers = new int[10];
		
		// DECLARE AN ARRAY OF SIZE EQUAL TO A VARIABLE
		int numberOfStudents = 28;
		int[] numbers2 = new int[numberOfStudents];

		// Hardcoding an array
		String[] names = {"Blythe", "Blair", "Kevin", "Nick", "George"};
		System.out.println(names.length);
		
		// To output the memory address of the array
		// [Ljava.lang.String;@15db9742
		System.out.println(names);
		
		// 
		Scanner michael = new Scanner(System.in);
//		System.out.println(michael);
		
		System.out.println(names[3]);
		
		System.out.print("Enter a new name: ");
		
		names[3] = michael.nextLine();
		
		System.out.println(names[3]);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
