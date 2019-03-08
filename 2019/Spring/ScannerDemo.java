import java.util.Scanner;

public class ScannerDemo
{
    // A way to globally declare 'scanner' and make it visible ANYWHERE in the program
    static Scanner scanner = new Scanner(System.in);
    
    public static void main ( String[] args )
    {
        
        menu();
        
    }
    
    public static void menu ()
    {
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        System.out.println();
        
        // CLUTCH! This sends the scanner to the next line so it is READY to read in a String.
        // It "readies" the scanner
        scanner.nextLine();
        
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        
    }
    
}





