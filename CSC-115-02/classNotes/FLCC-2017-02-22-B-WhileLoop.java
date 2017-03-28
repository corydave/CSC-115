package examples;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner kazoo = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = kazoo.nextInt();
		
		while (num >= 0) {
			System.out.println(num);
			num--
		}
		
		System.out.println("Game Over");
//		#KAZOO
		
		
		
	}

}
