package examples;

public class DoWhileExample {

	public static void main(String[] args) {
		// A "do-while" loop will ALWAYS run at least
		// one time - the computer checks the status of
		// the control _at the end of the iteration_.

		int x = 0;
		
		do {
			
			System.out.println("x = " + x);
			x++;
			
		} while (x < 10);
		
	}

}
