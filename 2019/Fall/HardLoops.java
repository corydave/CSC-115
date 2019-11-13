import java.util.Scanner;

public class HardLoops {
    public static void main (String[] args) { 
        
        Scanner sc = new Scanner(System.in);

        // stringIterate(sc);
        // playAgain(sc);
        multipleStringIterate(sc);
        
        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void multipleStringIterate(Scanner scanner) {
    
        boolean playAgain = true;
    
        while (playAgain == true) {
            stringIterate(scanner);
            System.out.println("Would you like to play again (yes/no)?");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

    }
    
    public static void playAgain(Scanner scanner) {
        
        System.out.println("Would you like to play again?");
        String answer = scanner.nextLine();

        // int a = 10;
        // int b = 20;
        
        // if (a != b) {
        //     //do something
        // }

        while (!(answer.equalsIgnoreCase("no"))) {
            System.out.println("BOO!");
            System.out.println("Would you like to play again?");
            answer = scanner.nextLine();
        }
        
    }

    
    public static void stringIterate(Scanner scanner) {

        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        
        if (phrase.length() < 1) {
            System.out.println("ERROR!");
            return;
        }
        
        System.out.println(phrase); // "echo"
        
        System.out.println();
        
        // If you want to examine each character in a String,
        // YOU WILL NEED A LOOP. PERIOD.
        
        for (int i = 0; i < phrase.length()-1 ; i++) {
            System.out.print(phrase.charAt(i) + "-");
        }
        
        System.out.print(phrase.charAt(phrase.length()-1));
        
        System.out.println();

    }
    
    
}

