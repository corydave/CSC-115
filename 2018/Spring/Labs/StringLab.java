import java.util.*;

public class StringLab {
    
    public static void main (String args[]) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a phrase: ");
        String phrase = scanner.nextLine();
        
        System.out.println();
        
        System.out.println("  1. Find the length of the string");
        System.out.println("  2. Perform charAt");
        System.out.println("  3. Perform compareTo");
        System.out.println("  4. Perform equals ");
        System.out.println("  5. Perform indexOf");
        System.out.println("  6. Perform substring");
        System.out.println("  7. Perform toLowerCase");
        System.out.println("  8. Perform toUpperCase");
        System.out.println();
        System.out.println("Please make a selection: ");
        
        int choice = scanner.nextInt();
        
        System.out.println();

        if (choice == 1) {
            
            System.out.println("The length of the phrase is " + phrase.length());
            
        } else if (choice == 2) {
            
            System.out.println("Enter a number between 0 and " + (phrase.length() - 1) + ": ");
            int pos = scanner.nextInt();
            System.out.println("\nThe character at " + pos + " is '" + phrase.charAt(pos) + "'");
            
        } else if (choice == 3) {

            System.out.println("Enter a phrase that will be compared with \"" + phrase + "\": ");
            scanner.nextLine();
            String newPhrase = scanner.nextLine();
    
            if (phrase.compareTo(newPhrase) < 0) {
                System.out.println("\nAlphabetically, \"" + phrase + "\" comes before \"" + newPhrase + "\"");
            } else if (phrase.compareTo(newPhrase) > 0) {
                System.out.println("\nAlphabetically, \"" + phrase + "\" comes after \"" + newPhrase + "\"");
            } else {
                System.out.println("\tThe two phrases are equivalent.");
            }    
            
        } else if (choice == 4) {

            System.out.println("Enter a phrase that will be compared with \"" + phrase + "\": ");
            
            scanner.nextLine();
            String newPhrase = scanner.nextLine();
            System.out.println();
            
            if (phrase.equals(newPhrase)) {
                System.out.println("The two phrases DO have the same sequence of characters.");
            } else {
                System.out.println("The two phrases DO NOT have the same sequence of characters.");
            }
        
        } else if (choice == 5) {

            System.out.println("Enter a String to search \"" + phrase + "\" for: ");
            
            scanner.nextLine();
            String newPhrase = scanner.nextLine();
            System.out.println();
            
            int pos = phrase.indexOf(newPhrase);
            
            if (pos != -1) {
                System.out.println("The first occurrence of \"" + newPhrase + "\" is at index " + pos);
            } else {
                System.out.println("\"" + newPhrase + "\" is not in the phrase \"" + phrase + "\"");
            }
        
        } else if (choice == 6) {
            
            System.out.println("Choose one of the methods:");
            System.out.println("  1. Create a substring from a selected index until the end");
            System.out.println("  2. Create a substring from a selected index until another selected index");
            System.out.println();
            System.out.println("Enter selection here: ");
            
            int tempChoice = scanner.nextInt();
            
            if (tempChoice == 1) {
                System.out.println("Which index (between 0 and " + (phrase.length() - 1) + ") would you like to start with? ");
                int pos = scanner.nextInt();
                System.out.println("\nThe new phrase is: \"" + phrase.substring(pos) + "\"");
            } else {
                System.out.println("Which index (between 0 and " + (phrase.length() - 1) + ") would you like to start with? ");
                int startPos = scanner.nextInt();
                System.out.println("Which index (between " + startPos + " and " + (phrase.length() - 1) + ") would you like to end with? ");
                int endPos = scanner.nextInt();
                System.out.println("\nThe new phrase is \"" + phrase.substring(startPos, endPos) + "\"");
            }            
            
        } else if (choice == 7) {
        
            System.out.println("All lowercase looks like this: \"" + phrase.toLowerCase() + "\"");
            
        } else if (choice == 8) {
            
            System.out.println("All uppercase looks like this: \"" + phrase.toUpperCase() + "\"");
            
        } else {
            System.out.println("Not a valid number!");
        }

        scanner.close();
        
    }
    
}