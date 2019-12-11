import java.util.*;

public class Foggle {
    
    public static void main (String[] args) {
        
        // Create an empty array called 'letters' that will hold 9 values of type char
        char[] letters = new char[9];
        
        // Create an instance of 'Random' called 'random' that will be the
        // RNG for this program
        Random random = new Random();
        
        // Create an instance of 'Scanner' called 'scanner' that will be used
        // to take in input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Call the method 'populateLetters' to randomly populate the array
        // Don't forget to pass in 'letters' and 'random'
        populateLetters(letters, random);

        // Call the method 'displayLetters' to show the user the populated
        // characters in 'letters'
        // displayLetters(letters);
        
        playFoggle(letters, scanner);
        
        // #BillPaxton #neverForget #RIP #Aliens #TwisterInSpace
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void populateLetters(char[] letters, Random random) {
        
        for (int i = 0; i < letters.length; i++) {
            
            letters[i] = (char)(random.nextInt(26) + 65);
            
        }
        
    }
    
    public static void displayLetters(char[] letters) {
        
        for (int i = 0; i < letters.length; i++) {
            
            System.out.print(letters[i] + " ");
            
        }
        
        System.out.println();
        
    }
    
    public static void playFoggle(char[] letters, Scanner scanner) {
        
        System.out.println("Welcome to Foggle! Here are your letters:");
        displayLetters(letters);
        System.out.println();
        System.out.println("Enter words that can be made with these letters.");
        System.out.println("Press '0' to end.");
        System.out.println();
        
        String guess = "";
        int score = 0;
        
        while (!guess.equals("0")) {
            
            System.out.println("\nSCORE: " + score + "\nWord: ");
            guess = scanner.nextLine().toUpperCase();
            boolean isValid = true;
            
            
            for (int i = 0; i < guess.length(); i++) {
                
                isValid = verifyLetter(letters, guess.charAt(i));
                
                if (isValid == false && !guess.equals("0")) {
                    
                    System.out.println("NOT VALID!");
                    score -= guess.length();
                    break;
                    
                } else {
                   
                  score++; 
                    
                }
                
            }
            
            
        }
        
        System.out.println("\n\nFINAL SCORE: " + (score-1));
        
    }
    
    public static boolean verifyLetter(char[] letters, char let) {
        
        for (int i = 0; i < letters.length; i++) {
            
            if (letters[i] == let) {

                return true;
                
            }
            
        }
        
        return false;
        
    }
    
    
}























