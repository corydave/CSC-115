package examples;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {

		// xINSTANTIATE a Scanner()
		// xDefine a variable to store the name [String]
		// xPrompt the user for their name and store it in the variable
		// xGreet the user by their name (echo)
		// xPrompt the user for a number
		// xStore the value the user inputs in the variable
		// xOutput the first 5 products (1-5)
		// xDisplay "Game Over"
		
		// Create a Scanner named 'jackBauer' and capture
		// input from the System.in stream
		Scanner jackBauer = new Scanner(System.in);
		
		// DECLARE a variable called 'name' to store the name of the user
		String name;
		
		// Prompt the user for their name
		System.out.print("What is your name? ");
		
		// ...and store their response in 'name'
		name = jackBauer.nextLine();
		
		// Echo their name and make them feel warm and fuzzy inside
		System.out.println("Why hello, " + name + ".");
		
		// Prompt the user for a number
		System.out.print(name + ", please enter a number: ");
		
		// DECLARE a variable to hold a number
		int num;
		
		// Grab the number they have typed in and store it in 'num'
		num = jackBauer.nextInt();
		
		// Output the first five products of 'num'
		System.out.println(num*1 + "\t" + num*2 + "\t" + num*3 + "\t" + num*4 + "\t" + num*5);
		num++;
		System.out.println(num*1 + "\t" + num*2 + "\t" + num*3 + "\t" + num*4 + "\t" + num*5);
		num++;
		System.out.println(num*1 + "\t" + num*2 + "\t" + num*3 + "\t" + num*4 + "\t" + num*5);
		num++;
		System.out.println(num*1 + "\t" + num*2 + "\t" + num*3 + "\t" + num*4 + "\t" + num*5);
		num++;
		System.out.println(num*1 + "\t" + num*2 + "\t" + num*3 + "\t" + num*4 + "\t" + num*5);

		System.out.println("Game over!");
		
		jackBauer.close();
		
	}

}










