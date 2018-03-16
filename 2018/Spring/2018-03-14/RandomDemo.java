import java.util.Random;

public class RandomDemo {
    public static void main (String[] args) {
        
        // STEP 1: Instantiate an object of Random
        Random random = new Random();
        
        // STEP 2: Use .nextInt(int)
        int randNum = random.nextInt(100) + 1; // 0-99
        // System.out.println(randNum);
        
        // System.out.println(random.nextInt(100) + 1);
        
        // If you want a number 75 - 100
        int randNum2 = random.nextInt(26) + 75;
        
        // Jonah's Pro-Tip:
        // Whatever you add to the random method call is your minimum
        // Your maximum is what you add to the method call, plus your parameter, minus 1
        
        
        // Range: 65 to 90
        int capLetter = random.nextInt(26) + 65;
        System.out.println(capLetter);
        
        char letter = (char)capLetter;
        System.out.println(letter);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}