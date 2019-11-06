import java.util.Scanner;

public class ForLoopDemo {
    public static void main (String[] args) {
        
        // WHILE LOOP
        
        System.out.println("START WHILE LOOP");
        int counter = 0; // Loop Control Variable
        while (counter < 10) { // Logical test
            System.out.print(counter + " ");
            counter++; // Update
        }    
        System.out.println("\nEND WHILE LOOP");
        
        System.out.println();
        System.out.println();
        
        // FOR LOOP
        System.out.println("START FOR LOOP");
        
        // (START; CONDITION; UPDATE)
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 10;) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        
        int j = 0; // Loop Control Variable
        for (; j < 10;) { // Logical Test
            System.out.print(j + " ");
            j++; // Update
        }        
        
        
        
        
        
        
        System.out.println();
        
        
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        }
        
        // System.out.println(i); // i LIVES & DIES BY THE BRACES
        
        System.out.println("\nEND FOR LOOP");
        
        System.out.println();
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting number:");
        int startingNumber = scanner.nextInt();
        
        System.out.println("Enter an ending number:");
        int endingNumber = scanner.nextInt();
        
        System.out.println("How much do you want to go up by?");
        int update = scanner.nextInt();
        
        for (int i = startingNumber; i <= endingNumber; i += update) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
      

    }
}





















