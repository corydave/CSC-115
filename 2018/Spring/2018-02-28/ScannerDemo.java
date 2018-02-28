import java.util.Scanner;

public class ScannerDemo {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num;
        String str;
        
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Enter a String: ");
        str = scanner.nextLine();
        
        
        
        System.out.println("num = " + num);
        System.out.println("str = " + str);
        
        
        
        
        
        
    }
}




