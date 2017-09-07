package examples;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {

		Scanner danWang = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = danWang.nextLine();
		System.out.println("Your name is " + name);
		System.out.println();
	
//-----------------------------------------------------------
		
		System.out.print("Enter your age: ");
		int age = danWang.nextInt();
		System.out.println("Your age is: " + age);
		System.out.println();

//-----------------------------------------------------------		
		
		System.out.print("Enter your middle name: ");
		danWang.nextLine();
		String middleName = danWang.nextLine();
		System.out.println("Your middle name is: " + middleName);
		System.out.println();
				
		System.out.println("GAME OVER");
		
		danWang.close();
		
	}

}
