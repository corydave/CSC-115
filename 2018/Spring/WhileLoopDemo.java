import java.util.Scanner;

public class WhileLoopDemo {
    public static void main (String args[]) {
        
        // RULES OF LOOPS
        
        // When you program a loop, you should know that it will DEFINITELY end
        // USUALLY, you'll have to increment some variable so that it will approach the end state
        // Do NOT forget braces!!!!
        // If a loop encounters a 'break', the loop stops dead in its tracks
        
        int counter = 0;
        
        while (counter != 5) {

            counter += 1; // update
            System.out.println(counter);
            
            // if (<some condition>) { 
            //     break;
            // }
            
            
            // counter = counter + 1;
            // counter++;
            
        }
        
        
        
    }
}




















