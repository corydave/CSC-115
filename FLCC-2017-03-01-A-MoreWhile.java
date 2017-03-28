package examples;
import java.util.Scanner;
import java.util.Random;

public class MoreWhileLoops {

	public static void main(String[] args) {
		Scanner toto = new Scanner(System.in);
		Random randy = new Random();

		int num = -5;
		int counter = 0;
		
		while (num != 50) {
//		while (true) {
		
			num = randy.nextInt(100)+1;
			System.out.println(num);
			
//			if (num == 50) {
//				break;
//			}
			
			counter++;

		}

		System.out.println("\nYou got it in " + counter + " moves.");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		toto.close();
	}

}
  
