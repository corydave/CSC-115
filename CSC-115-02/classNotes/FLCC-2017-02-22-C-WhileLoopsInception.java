package examples;
import java.util.Scanner;

public class WhileLoopsInception {

	public static void main(String[] args) {
		
		Scanner kazoo = new Scanner(System.in);
		String playAgain = "Y";
		
		while (!playAgain.equalsIgnoreCase("N")) {
			System.out.println("Hello World!");
			System.out.print("Would you like to play again (y/n)? ");
			playAgain = kazoo.nextLine();
		}
	}
}
