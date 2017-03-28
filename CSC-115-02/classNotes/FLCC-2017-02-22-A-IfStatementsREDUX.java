package examples;
import java.util.Scanner;

public class IfStatementsREDUX {

	public static void main(String[] args) {

		Scanner billMurray = new Scanner(System.in);
		
//		System.out.print("Enter something: ");
//    String blergh = billMurray.nextLine();
//    
//		if (!blergh.equals("")) {
//			System.out.println("You typed SOMETHING");
//		}

    System.out.println("Enter something: ");
		int num = billMurray.nextInt();
		
		System.out.println("Enter something else: ");
		int num2 = billMurray.nextInt();
		
		if (num == 33 || num == 23) {
			System.out.println("NBA All Stars");
		}

		System.out.println("Game Over");

	}

}
