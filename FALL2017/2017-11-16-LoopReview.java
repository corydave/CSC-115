import java.util.Scanner;

public class LoopReview {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Upper limit? ");
        // int upperLimit = scanner.nextInt();
        
        // for(int i = -10; i <= upperLimit; i+=6) {
            
        //     System.out.println(i);
            
        // }
        
        
        // String b = "";
        
        // for(; !b.equals("Brent"); ) {
        //     System.out.print("String? ");
        //     b = scanner.nextLine();
        // }
        
        
        
        
        // for (double i = 0; i <= 2.0; i+=.1) {
        //     System.out.println(i);
            
        // }
        
        
        
        final int STAR_NUMBER = 10;
        final int LINES = 5;

        // (int)(Math.random()*10)        
        
        for (int j = 1; j < LINES; j++) {
            
            for (int i = LINES; i > j; i--) {
                System.out.print(" ");
            }            
            
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        

        for (int j = LINES; j > 0; j--) {
            
            for (int i = LINES; i > j; i--) {
                System.out.print(" ");
            }            
            
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }        
        
        
        
        
        
        
        
        
    }
}














