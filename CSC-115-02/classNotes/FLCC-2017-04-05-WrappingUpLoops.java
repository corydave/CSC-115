package examples;
import java.util.Scanner;

public class WrappingUpLoops {

	public static void main(String[] args) {

		Scanner george = new Scanner(System.in);
		System.out.print("How big is the triangle? ");
		
		int triangleSize = george.nextInt();
		triangleSize -= 2;
		
		String symbol = "*";
		
		for (int j = 0; j <= triangleSize; j++) {
			System.out.print(" ");
		}
		
		System.out.println(symbol);

		if (triangleSize > 1) {
		  drawTriangle(triangleSize, symbol);
		}
	}
	
	public static void drawTriangle(int triangleSize, String symbol) {
		
		for (int j = 0; j < triangleSize; j++) {

			for (int i = triangleSize; i > j; i--) {
				System.out.print(" ");
			}

			System.out.print(symbol + " ");

			for (int i = 0; i < j; i++) {
				System.out.print("  ");
			}
			
			System.out.print(symbol);

			System.out.println();

		}
		
		for (int i = 0; i <= triangleSize+1; i++) {
		  System.out.print(symbol + " ");
		}
		
	}

}

// if (i == 55) {
// System.out.println("Yeah! " + i);
// break;
// }
