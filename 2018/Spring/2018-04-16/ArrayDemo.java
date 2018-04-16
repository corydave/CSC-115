import java.util.Scanner;
import java.util.Random;

public class ArrayDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] temp = new int[7]; // DECLARE the array and ASSIGN it
/*
        -----------------------------
        | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
        -----------------------------
          0   1   2   3   4   5   6
*/
        temp[0] = 29; // LOADING the array with values
        temp[1] = 31;
        temp[2] = 41;
        temp[3] = 16;
        temp[4] = 30;
        temp[5] = 30;
        temp[6] = 30;

/*
        ------------------------------------
        | 29 | 31 | 41 | 16 | 30 | 30 | 30 |
        ------------------------------------
           0    1    2    3    4   5    6
*/  

        System.out.println(temp[3]); // 16 
  
        double averageOfWeekend = (temp[0] + temp[1])/2.0; // 30.0
        System.out.println("Weekend Average: " + averageOfWeekend);
  
        temp[3] = 26; // There is no output here, we just changed a value
  
/*
        ------------------------------------
        | 29 | 31 | 41 | 26 | 30 | 30 | 30 |
        ------------------------------------
           0    1    2    3    4   5    6
*/
        
        System.out.println(temp[3]); // 26
  
        int[] monthlyTemps = new int[30]; // Create a new array of size 30!
  
        System.out.println("FIRST: " + temp[0]); // Reliably output the FIRST element
        System.out.println("SEVENTH: " + temp[6]); // Reliabley output the LAST element of an array of size 7
        System.out.println("LAST: " + temp[temp.length - 1]); // Reliable output the LAST element of ANY array
  
        // System.out.println(temp[7]); // ArrayIndexOutOfBoundsException!
        
        System.out.println("ADDRESS: " + temp);
        
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("]");
        
        System.out.println();













        
        
        
        // String abc = "abcdefghij";
        // System.out.println(abc.length());   // 10
        // System.out.println(abc.charAt(2));  // c
        // System.out.println(abc.charAt(9));  // j
        // System.out.println(abc.charAt(abc.length()-1));
        
    }
}

























/*








  
  
  RULES:
    1. Once an array is born, it will FOREVER be the size that it was when it was created
       (You can't resize an array)
    
    2. Arrays can only hold ONE type of data. That is, they cannot hold some ints, some Strings, and some doubles
    
    3. DO NOT INDEXOUTOFBOUNDS YOURSELF. It's embarassing.
    
    4. ALWAYS assign the size of the array (usually when you declare it)
    
    
  
  
  
















*/