import java.util.Scanner;
import java.util.Random;

public class Palindrome {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to be palindromized:");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        
        boolean isPalindrome = true; // flag
        
        int comparisons = word.length()/2;

        for (int i = 0; i < comparisons; i++) {
            
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }    

        System.out.println(isPalindrome);
        
        
        
        
        
    }
}









/*
        if ((word.charAt(0) == word.charAt(4)) && (word.charAt(1) == word.charAt(3))) {
            System.out.println("THIS IS A PALINDROME");
        } else {
            System.out.println("THIS IS NOT A PALINDROME");
        }

*/






        
        // if (word.length() == 1) {
        //     isPalindrome = true;
        // }



