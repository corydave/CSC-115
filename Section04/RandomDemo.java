import java.util.Scanner;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		System.out.println("Math.random: " + Math.random());
		System.out.println("MilliSeconds: " + (System.currentTimeMillis() % 6 + 1));
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(15);
		
		System.out.println("Random: " + (random.nextInt(100)));
				
	}

}
