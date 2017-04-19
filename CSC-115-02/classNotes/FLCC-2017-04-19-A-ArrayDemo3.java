package examples;

public class ArrayDemo3 {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		
		numbers[0] = 18;
		numbers[1] = 9;
		numbers[2] = 4356;
		numbers[3] = 5456;
		numbers[4] = 3;
		numbers[5] = 1;
		numbers[6] = 20;
		numbers[7] = 145;
		numbers[8] = 187;
		numbers[9] = 909;
		
		System.out.println(numbers[5]);  // 0
		
		System.out.println(numbers.length); // 10

		// Output the first element
		System.out.println(numbers[0]);
		
		// Output the last element
		System.out.println(numbers[numbers.length-1]);
		
		// WTF???
		System.out.println(numbers[numbers[4]]);
		System.out.println(numbers[numbers[numbers[10/2]]]);
		
		
		// Finding the maximum value in an array
		
		/*
		 * 1. Declare a variable to hold the biggest value in the array
		 * 2. At the beginning, that value should be the first element in the array
		 * 3. Walk through the array (in a loop!) and look at every element
		 * 4. If the value of the element you are in is bigger than the variable that holds the biggest number, REASSIGN IT!!!
		 * 
		 */
		
		int maxValue = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		
		System.out.println("The biggest value is " + maxValue);
		
		
		
		
		
		
		
		
		
		

	}

}
