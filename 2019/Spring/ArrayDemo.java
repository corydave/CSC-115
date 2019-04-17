import java.util.Scanner;

public class ArrayDemo {
    
    public static void main (String[] args) {
        
        System.out.println("HI");
        Scanner fluffy = new Scanner(System.in); // #throwBackWednesday!
        
        
        // One way to create an array of size 10 that holds
        // only Strings. The value of each element is ""
        String[] students = new String[8];
        
        // Populate the array
        students[0] = "Alex";
        students[1] = "Bart";
        students[2] = "Charlie";
        students[3] = "Davida";
        students[4] = "Erika";
        students[5] = "Fred";
        students[6] = "Greg";
        students[7] = "Howie";
        
        
        System.out.println("The last element is " + students[7]);
        
        System.out.println("Enter a new name");
        students[7] = fluffy.nextLine();

        System.out.println("The last element is " + students[7]);
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("How many grades are there?");
        int numOfGrades = fluffy.nextInt();

        
        int[] grades = new int[numOfGrades];
        
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter a grade for assignment " + i);
            grades[i] = fluffy.nextInt();
        }
        
        // System.out.println(i); // Won't work because of SCOPE
        // System.out.println(grades); // UGLY! [I@566776ad
        
        
        
        
        
        
        // Walk through the loop and output each value
        for (int i = 0; i < grades.length; i++) {
        
            System.out.println(grades[i]);
            
        }
        
        // Average all the numbers in the array
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        
        System.out.println("The total points is: " + sum);
        System.out.println("The average is: " + (1.0*sum/grades.length));
        
        // Reliably change the FIRST element in an array:
        grades[0] = 100;
        
        // Reliably output the LAST element:
        grades[grades.length-1] = 200;
        
        
        // Walk through the loop and output each value
        for (int i = 0; i < grades.length; i++) {
        
            System.out.println(grades[i]);
            
        }
        
        
        
        
    }
}








/*

        System.out.println("Enter a new name");
        String newName = fluffy.nextLine();
        
        students[7] = newName;

*/

