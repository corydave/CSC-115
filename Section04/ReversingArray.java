package arrayDemo;
import java.util.Random;

public class ReversingArray {

	public static void main(String[] args) {

		int[] randomNumbers = new int[20];

		outputArray(randomNumbers);
		randomlyPopulateArray(randomNumbers);
		outputArray(randomNumbers);
		///////////////////////////////////
		randomNumbers = reverseArray(randomNumbers);
		outputArray(randomNumbers);

	}
	
	static void randomlyPopulateArray(int[] arr) {
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
	}
	
	
	static int[] reverseArray(int[] arr) {
		
		int[] tempArray = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tempArray[arr.length-i-1] = arr[i];
		}

		return tempArray;

	}
	

	static void outputArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

}
