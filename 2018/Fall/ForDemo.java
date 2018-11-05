// Please oh please don't splode!
import java.util.*;

public class ForDemo {
    public static void main (String[] args) {
        
        /*
        
        int a = 3;
        while (a < 10) {
            System.out.println(a);
            a += 3;
        }
        
        */
        
        
        
         // Initializer: i = 0
                   // Condition: i < 10
                              // Update: i++
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        
        // System.out.println(i); // The scope of i is inside the bun
        
        
        
        int scale = 2;
        
        for (int i = 1; i < 6; i+=3) {
            System.out.println(i*scale);
            scale--;
            if (i % 2 == 0) {
                i--;
            }
        }
        
        System.out.println(scale);
        
        // while (true) {}
        
        /*
        for (;;) {
            System.out.println("Dennis");
        }
        
        
        for (; guess != answer; ) {
            
            if (guess == answer) {
                break;
            }
            
        }
        
        */
        
        
        
        
    }
}

