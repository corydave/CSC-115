import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayDemo {
    
    public static void main (String[] args) {
    
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How long do you want yer array?");
        
        int[] grades = new int[scanner.nextInt()];
        System.out.println("The length of the array is " + grades.length);
        
        for (int i = 0; i < grades.length; i++) {
            
            System.out.println("Enter element number " + i + ": ");
            grades[i] = scanner.nextInt();
            
        }
        
        
        
        // int[] grades = {3, 2, 30, -4, 21};
        
        
        
        
        
        System.out.print("\nThe location of the array is: " + grades);
        // System.out.println("TEST: " + grades[1]);
        
        System.out.print("\nYour array values are: ");
        outputArray(grades);
        
        
        System.out.println("\n\nThe mean is " + computeMean(grades));
        System.out.println("\n\nThe range is " + computeRange(grades));
        System.out.println("\n\nThe median is " + computeMedian(grades));
        
        
        
        
        
        
        System.out.println("\n\nGAME OVER MAN!!!");
        
    }

    public static double computeMedian(int[] arr) {
        
        Arrays.sort(arr);
        outputArray(arr);

        if (arr.length % 2 != 0) {
            
            return arr[arr.length/2];
            
        } else {
            
            int leftOfMiddle = arr[arr.length / 2 - 1];
            int rightOfMiddle = arr[arr.length / 2];
            
            return (1.0 * leftOfMiddle + rightOfMiddle) / 2;
            
        }

    }    
    
    
    
    
    
    
    
    
    
    
    public static double computeRange(int[] arr) {
        
        int lowestNumber = arr[0];
        int highestNumber = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
         
            if (arr[i] > highestNumber) {
                highestNumber = arr[i];
            }
            
        }        
        
        
        for (int i = 0; i < arr.length; i++) {
         
            if (arr[i] < lowestNumber) {
                lowestNumber = arr[i];
            }
            
        }
        
        // System.out.println("The lowest number is " + lowestNumber);
        // System.out.println("The highest number is " + highestNumber);
        
        return highestNumber - lowestNumber;
        
        
    }





















    
    
    public static double computeMean(int[] arr) {
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i];
            
        }
        
        return 1.0*sum/arr.length;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void outputArray(int[] arr) {
        
        System.out.print("[");
        
        for (int i = 0; i < arr.length-1; i++) {
            
            System.out.print(arr[i] + ", ");
            
        }
        
        System.out.print(arr[arr.length-1]);
        
        System.out.print("]");
        
    }
    
    
    
    
}






























        /*
        WRONG WRONG WRONG WRONG, WRONG WRONG WRONG WRONG
        YOU'RE WRONG... YOU'RE WRONG... YOU'RE WRONG...
        int grade01 = 90;
        int grade02 = 100;
        int grade03 = 0;
        */
        
        
        
        
        /*

        int[] grades = new int[5];
        
        grades[grades.length-1] is always the last element!!!!
        
        
        [75, 85, 50, 95, 3]
          0   1   2   3  4
          
        grades[2] is 50
        grades[0] is 75
        grades[4] is 3
        grades[grades[4]] is 95
        
            grades[-1] and grades[10] and grades[grades[1]] is SPLODE CITY
              ArrayIndexOutOfBoundsException
        
        grades[1] = 3;
        
        grades_________
        [75, 3, 50, 95, 3]
          0   1  2   3  4
          
            grades[1] = "Hi";
            int x = "Hi";
              TypeMismatchException
        
        grades[1] = grades[2] * 2;
        grades[1] is now 100!


        grades_________
        [75, 100, 50, 95, 3]
          0   1    2   3  4

        
        
        System.out.println(grades[1]); // 100
        System.out.println(grades[1]/2); // 50
        
        grades[0] = grades[0]++;

        grades_________
        [76, 100, 50, 95, 3]
          0   1    2   3  4

        
        System.out.println(grades); // [76, 100, 50, 95, 3]
        System.out.println(grades); // array@1f34e2



        
        */
