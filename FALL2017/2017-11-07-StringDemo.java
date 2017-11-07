import java.util.*;

public class StringDemo {
  public static void main (String args[]) {
    
    String firstName = "Larry";
    String lastName = "Bird";
    
    // concatenate
    System.out.println(firstName + " " + lastName);
    
    // equals - DON'T USE: firstName == "Larry"
    // returns BOOLEAN
    System.out.println(firstName.equals(lastName));
    if (firstName.equals("Larry")) {
      System.out.println("The Strings are equal.");
    } else {
      System.out.println("These Strings are NOT equal");
    }
    
    // charAt(int)
    System.out.println("The character at position 2 is: " + firstName.charAt(2));
    char firstLetterOfFirstName = firstName.charAt(0);
    String firstLetter = "" + (firstName.charAt(0));
    
    // length()
    System.out.println("The length of 'firstName' is: " + firstName.length());
    System.out.println("The last letter of 'firstName' is: " + firstName.charAt(firstName.length()-1));
    
    // toUpperCase()
    System.out.println("toUpperCase: " + firstName.toUpperCase());
//     firstName = firstName.toUpperCase();
    
    // toLowerCase()
    System.out.println("toLowerCase: " + firstName.toLowerCase());    
    
    // indexOf(char)
    // returns INT (the number of the position where the char
    // resides, or -1 if it isn't in there, or if you're Matt)
    System.out.println("indexOf 'r': " + firstName.indexOf('r'));
    
    // indexOf(String)
    System.out.println("indexOf \"ry\": " + firstName.indexOf("ry"));
    
    // substring(int)
    System.out.println("substring(2): " + firstName.substring(2));

    // substring(int, int)
    System.out.println("substring(1, 3): " + firstName.substring(1, 3));
    
    // compareTo(String)
    // This returns a wonky number (but we only care
    // if that number is positive, 0, or negative)
    System.out.println("apples".compareTo("oranges"));
    System.out.println("egg".compareTo("chicken"));
    System.out.println("apples".compareTo("aranges"));
    System.out.println("apples".compareTo("applesauce"));
    
    // trim()
    // returns a STRING with leading and trailing spaces removed
    String spaceCadet = "      Spa ce        ";
    System.out.println("length of spaceCadet: " + spaceCadet.length());
    System.out.println("...and trimmed: " + spaceCadet.trim().length());
    
    // equalsIgnoreCase(String)
    System.out.println(firstName.equals("LARrY"));
    System.out.println(firstName.equalsIgnoreCase("LARrY"));    
    
    System.out.println();
    System.out.println();
    
    

    System.out.println(firstName);
    
    
  }
}
