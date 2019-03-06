import java.util.Scanner;

public class SwitchDemo {
    public static void main (String[] args) {
        
        showSwitch();
        endGame();
        
    }
    
    public static void showSwitch() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the...");
        System.out.println("\t1. Jungle");
        System.out.println("\t2. Danger Zone");
        System.out.println("\t3. Machine");
        System.out.println("\t4. Moes!");
        System.out.println("Choose your destiny:");
        
        int choice = scanner.nextInt();
        
        // System.out.println("DEBUG: You chose " + choice);
        
    
        switch (choice) {
        
            case 1:  System.out.println("Guns. And. ROSES!");
                     break;
            
            case 2:  System.out.println("LANA!!!!!!!");
                     System.out.println("Do you want falling through? Because this is how you fall through!");
                    //  break;
                     
            case 3:  System.out.println("Pink Floyd");
                     break;
                     
            case 4:  System.out.println("Guac is extra.");
                     break;
                     
            default: System.out.println("ID 10 T error");
    
        }
    
    
    
        
    }
    
    
    
    
    
    
    
    
    
    public static void endGame() {
        
        System.out.println("\n\nGAME OVER MAN!");
        
    }
    
    
    
}






        // if (choice == 1) {
        //     System.out.println("Guns. And. ROSES!");
        // }
        
        // if (choice == 2) {
        //     System.out.println("LANA!!!!!!!");
        // }
        
        // if (choice == 3) {
        //     System.out.println("Pink Floyd");
        // }
        
        // if (choice == 4) {
        //     System.out.println("Guac is extra.");
        // }
        
        // if (choice > 4 || choice < 1) {
        //     System.out.println("ID 10 T error");
        // }
















