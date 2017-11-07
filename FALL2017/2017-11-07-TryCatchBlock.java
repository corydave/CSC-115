import java.util.*;

public class TryCatchBlock {
    public static void main (String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
        
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("You chose: " + num);
            
       }  catch (InputMismatchException err) {
            
            System.out.println("ID10T");
            
        } catch (Exception err) {
            
            System.out.println("ERROR!\nThe error is: " + err);
            
        }
        
        
        
    }
}
