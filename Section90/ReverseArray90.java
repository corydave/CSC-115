package arrayDemo;
import java.util.Scanner;
public class ReverseArray90 {

	public static void main(String[] args) {

		String[] stringArray = new String[6];
		
		outputArray(stringArray);
		loadTheArray(stringArray);
		outputArray(stringArray);
		reverseArray(stringArray);
		outputArray(stringArray);
			
	}
	
	static void reverseArray(String[] arr) {
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i -1] = temp;
		}
	}
	
	
	static void outputArray(String[] arr) {
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
	
	static void loadTheArray(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a name: ");
			arr[i] = scanner.nextLine();
		}
	}

}








