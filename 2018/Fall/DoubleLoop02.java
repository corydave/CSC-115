import java.util.*;

// #stillNoSplode

public class DoubleLoop02 {
    
    public static void main (String[] args) {

        // for (int j = 2; j > 0; j--) {
            
        //     System.out.print("-");
            
        // }

        int rows = 3;

        for (int i = 0; i < rows; i++) {
            
            
            for (int j = rows-1-i; j > 0; j--) {
                
                System.out.print("-");
                
            }
            
            
            for (int j = 0; j <= i; j++) {
                
                System.out.print("*");
                
            }

            for (int j = 0; j < i; j++) {
                
                System.out.print("*");
                
            }            

            for (int j = rows-1-i; j > 0; j--) {
                
                System.out.print("-");
                
            }               

            System.out.println();

        }

    }
    
    
   
    
}
