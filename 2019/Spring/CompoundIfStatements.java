import java.util.*;


public class CompoundIfStatements {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();        
        
        if ((a > b) && (b != 0)) {
            System.out.println(a/b);
        }
        
        System.out.println("GAME OVER MAN!");
        
    }    
    
    
    scanner.close();
    
    
}




















