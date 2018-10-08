import java.util.Scanner;

public class IfMultiples {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = scanner.nextInt();
        
        if (grade > 90) {
            System.out.println("A");
        }

        if (grade > 80) {
            System.out.println("B");
        }
        
        if (grade > 70) {
            System.out.println("C");
        }        
        
        if (grade > 60) {
            System.out.println("D");
        }        

        if (grade > 50) {
            System.out.println("F");
        }        
        
        /////////////////////////////////
        
        
        /*
        With multiple IF statements, it is possible that more than one
        of the IF statements will execute.
        */
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        if (grade > 90) {
            System.out.println("A");
        }
        
        if ((grade >= 80) && (grade < 90)) {
            System.out.println("B");
        }
        
        if ((grade >= 70) && (grade < 81)) {
            System.out.println("C");
        }
        
        if ((grade >= 60) && (grade < 70)) {
            System.out.println("D");
        }
        
        if (grade < 60) {
            System.out.println("F");
        }        
        
        
        
        
        
        
        
        
        
        
    }
}
