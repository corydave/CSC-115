// Dave Ghidiu
// This is a demo using the String class

import java.util.Scanner;

public class StringDemo {
    public static void main (String[] args) {
        
        /*
         We use int and double quite a bit
         Those are primitive data types
         
         OBJECTS are like primitive data types, except better
         in every way in fact, they're not like PDTs at all.
         
         OBJECTS typically have attributes, and have "methods" that
         can do things.
         
         Here's a list of things a String can do:
           - length -> returns the length (number of characters)
           - toUppercase -> converts to uppercase
           - toLowercase -> converts to lowercase
           - equals -> Compares two String objects
                We use == to test PDTs
                But we use .equals with Objects
           - charAt -> Return the position (index) in the String where the char is
           
           Relevant API
           https://docs.google.com/document/d/1BMpCADvfronkvfuTlxFC-G1-jjFovyBwOPpgv7BZuaM/edit
           
           
        */
        
        String name = "Ronald McDonald";
        
        int lengthOfString = name.length();
        char randomLetter = name.charAt(10); //
        
        
        // System.out.println("The length is: " + name.length());
        System.out.println("The length is: " + lengthOfString);
        
        // System.out.println("The character at position 1 is " + name.charAt(15));
        System.out.println("The character at position 1 is " + name.charAt(14));
        
        System.out.println(randomLetter);
        
        System.out.println("UPPERCASE: " + name.toUpperCase()); // RONALD MCDONALD
        System.out.println(name);
        
        name = name.toUpperCase();
    //  rhs    lhs
    
        System.out.println(name);
        
        String str1 = "Star Trek";
        String str2 = "Star Wars";
        
        // if (str1 == str2) {
        if ( str1.equals(str2) ) {    
            System.out.println("They are the same!");
        } else {
            System.out.println("They are DEFINITELY NOT the same");
        }
        
        
        
        
        
        
        
    }
}


















