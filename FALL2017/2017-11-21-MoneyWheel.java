import java.util.*;

public class MoneyWheel {
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int[] numberArray = new int[100];
    int[] numArrayToo = new int[20];
    boolean[] boolArray = new boolean[4];

    // Load the array, one box at a time,
    // with a random number between 0 and 33
    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = random.nextInt(54) + 1;
    }

    printArray(numberArray);
    printArray(numArrayToo);
    printArray(boolArray);
 
  
  }
  
  
  
  public static void printArray(int[] arr) {
    // Output the contents of the array
    System.out.print(arr[0]); 
    for (int i = 1; i < arr.length; i++) {
      System.out.print(", " + arr[i]);
    }      
    
    System.out.println();
  
  }
  
  public static void printArray(boolean[] arr) {
    // Output the contents of the array
    System.out.print(arr[0]); 
    for (int i = 1; i < arr.length; i++) {
      System.out.print(", " + arr[i]);
    }      
    
    System.out.println();
  
  }  

}



