import java.util.Random;
import java.util.Scanner;

public class RandomSeedDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seed: ");
        int seed = scanner.nextInt();
        
        Random random = new Random(seed);
        
        int rand = random.nextInt(100);
        System.out.println("Random Number 1 = " + rand);
        
        int rand2 = random.nextInt(41) + 10; // 10-50
        System.out.println("Random Number 2 = " + rand2);
        
        int rand3 = random.nextInt(26) + 65; // 65-90
        System.out.println("Random Number 3 = " + rand3);
        char randomUC = (char)(rand3);
        System.out.println("Character: " + randomUC);
        
    }
}