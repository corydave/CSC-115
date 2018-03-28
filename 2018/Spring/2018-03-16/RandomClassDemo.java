import java.util.Random;

public class RandomClassDemo {
    public static void main (String[] args) {
        
        // https://www.asciitable.com/
        
        Random random = new Random();
        
        int rand1 = random.nextInt(10); // range of 0-9
        System.out.println("Random number 1 = " + rand1);
        
        // Random number in a given range
        // Between 50 and 65
        int rand2 = random.nextInt(16) + 50;
        System.out.println("Random number 2 = " + rand2);
        
        // Random number cast as a CHAR
        // Between 65 and 90
        int rand3 = random.nextInt(26) + 65;
        System.out.println("Random number 3: " + rand3);
        
        char char1 = (char)rand3;
        System.out.println("Random character = " + char1);
        
    }
}