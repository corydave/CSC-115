// please no 'splode again
// import java.util.NoSplode;

import java.util.Random;
import java.util.Scanner;

public class RNG {
    public static void main (String[] args) {
        
        System.out.println("Welcome to the RNG game");
        
        // System.out.println(System.currentTimeMillis());

        // Random random = new Random(13); // SEEDED the random object
        Random random = new Random();
        
        int randNum = random.nextInt(10) + 1; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        
        System.out.println(randNum);
        
        
        
        
        
        
        
        System.out.println("GAME OVER MAN!");
        
        
    }
}


















