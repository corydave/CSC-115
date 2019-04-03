import java.util.Scanner;
import java.util.Random;

public class RandomDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a seed:");
        int seed = scanner.nextInt();
        
        // "Seeding" the random number generator
        Random random = new Random(seed);
        
        System.out.println("GENERATE A CAPITAL LETTER:");
        
        // Generate a random number between 0 and 26
        
        // Add 65 to that number so that we are looking
        // at the capital letters
        
        // Cast it as a char
        
        System.out.println((char)(random.nextInt(26) + 65));
        
        
    }
}








