import java.util.Scanner;

public class Scope {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1 or 2");
        int choice = scanner.nextInt();
        int a;
        
        if (choice == 1) {
            System.out.println("You chose 1");
            a = 10;
        } else {
            a = 20;
            System.out.println("You chose 2");
        }
        
        System.out.println(a);
        
        System.out.println("GAME OVER MAN!");
    }
    
    
}
