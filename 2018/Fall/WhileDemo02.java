import java.util.Scanner;
import java.util.Random;

// 'splode please. It's Monday

public class WhileDemo02 {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        // #secret #dontTellAnyoneThisPassword
        String password = "admin";
        String guess = "";
        int counter = 0;

        while (!guess.equals(password)) {
        
            System.out.println("Enter the magic password:");
            guess = scanner.nextLine();
        
            if (guess.equals(password)) {
                System.out.println("You got it!");
                 return;        
            } else {
                System.out.println("You fail at life.\n#'splode");
                System.out.println("That was attempt #" + (counter+1));
            }
            
            counter++;
        
        }
        System.out.println("It took you " + counter + " guesses.");
        System.out.println("\nGAME OVER MAN!");
        
    }
}






















