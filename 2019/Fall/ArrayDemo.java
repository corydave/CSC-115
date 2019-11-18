import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades?");
        int numOfGrades = scanner.nextInt();
        System.out.println();
        
        // Create an array of INTs
        int[] grades = new int[numOfGrades]; // MUST BE INT!

        // Walk through the array and load each value, one by one
        for (int i = 0; i < grades.length; i++) {    
            System.out.println("Enter grade #" + (i + 1) + ":");
            grades[i] = scanner.nextInt();
            System.out.println();
        }
        
        displayArray(grades);
        computeAverage(grades);
        findLowestGrade(grades);
        findHighestGrade(grades);
        // findRange(grades);
        
        
        
        
        
        
        
        
        System.out.println("\n\nGAME OVER MAN!");
        
    }
    
    public static void findLowestGrade(int[] grades) {
        
        int lowestGrade = grades[0];
        
        for (int i = 0; i < grades.length; i++) {
            if (lowestGrade > grades[i]) {
                lowestGrade = grades[i];
            }
        }
        
        System.out.println("LOWEST GRADE = " + lowestGrade + "%");
        
    }
    
    public static void findHighestGrade(int[] grades) {
        
        int highestGrade = grades[0];
        
        for (int i = 0; i < grades.length; i++) {
            if (highestGrade < grades[i]) {
                highestGrade = grades[i];
            }
        }
        
        System.out.println("HIGHEST GRADE = " + highestGrade + "%");
        
    }    
    
    
    
    public static void displayArray(int[] grades) {
        
        // System.out.println(grades);
        System.out.print("GRADES = ");
        for (int i = 0; i < grades.length; i++) {  
            System.out.print(grades[i] + " ");
        }

    }
    
    public static void computeAverage(int[] grades) {
        
        double total = 0.0;
        
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        
        System.out.println();
        
        System.out.println("AVERAGE = " + (total/grades.length) + "%");

    }
    
}
























// for (int i = 0; i < numOfGrades; i++) {
// System.out.println(grades[2]);
