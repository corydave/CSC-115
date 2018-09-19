// Dave Ghidiu
// 2018-09-19
// This program demonstrates how to use Scanner

// Need this to take in input from user
import java.util.Scanner; 



public class ScannerDemo {
    public static void main (String[] args) {
        
        // INSTANTIATES a Scanner, named 'potato' that
        // will take input from the keyboard
        // Scanner scanner = new Scanner(System.in);
        Scanner potato = new Scanner(System.in);
        
        
        // PROMPT the user for their name
        System.out.println("What is your name?");
        
        
        // DECLARE a variable to store that name
        String userName;
        
        
        // Use the Scanner (called 'potato') to store the
        // next line of input into the variable 'userName'
        userName = potato.nextLine();
        
        
        // Output the name
        System.out.println("Hello, " + userName + '!');
        
        
        // #neverforgettheonetimewhenwedanwanged
        // #neverForgetTheOneTimeWhenWeDanWanged
        
        potato.close();

    }
    
    
}


















