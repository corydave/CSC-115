import java.util.Scanner;

// Dave Ghidiu
// This program converts the number of inches to the lowest number of whole feet 


public class InchesToFeet {
    public static void main (String[] args) {
        
        // Create a scanner called 'scanner'
        Scanner scanner = new Scanner(System.in);
        
        // Create a variable named 'inches' that stores the input from
        // the user
        int inches;
        inches = scanner.nextInt();
        
        // Divide 'inches' by 12 and output the result
        System.out.println(inches/12);
        
    }
    
}
