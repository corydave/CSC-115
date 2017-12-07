import java.util.Scanner;
import java.util.Random;

public class SequentialSearchDemo {
  public static void main (String[] args) {

    /*
     * Sequential search has an average of n/2 searches
     * WORST CASE   SCENARIO: Big-O of n
     * BEST  CASE   SCENARIO: Big-O of 1
     * AVERAGE CASE SCENARIO: Big-O of n/2
     */
    
    // 1. Create an array of 20 ints 
    int[] arr = new int[20];
        
    
    // 2. Randomly populate it with ints between 1 and 100
    Random random = new Random(33);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    
    // 2.5 Display the array for funsies
    displayArray(arr);
    
    // 3. Ask user for a number
    System.out.print("\n\nWhat number are you looking for? ");
    Scanner scanner = new Scanner(System.in);
    int target = scanner.nextInt();    
    
    // 4. Walk through the array until we find the number
    // 5. Tell the user where their number is OR that it ain't there
    boolean isFound = false; // boolean flag!
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        isFound = true;
        System.out.println("Found your number at position " + (i + 1));
        break;
      }
    }
    
    if (isFound == false) {
      System.out.println("Your number is not in the array");
    }
  }
  
  public static void displayArray(int[] matey) {
    
    // Output first item
    System.out.print(matey[0]);
    
    // Iterate through array and output each term
    // all on the same line
    for (int i = 1; i < matey.length; i++) {
      System.out.print(" " + matey[i]);
    }
  }
  
}
