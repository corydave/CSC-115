public class Chapter02 {
    public static void main (String[] args) {
        
        // COMMENTS
        
        // This is a comment for a line
        int a = 10; // This comment is legal
        
        /*
         * TODO
         * Add block comments
         * Make cool programs
         */
         
        /** JavaDoc
         * @author Dave Ghidiu
         * @param age This is the age of the author
         * 
         * WE DON'T USE JAVADOCS IN THIS CLASS
         */
         
        // Use comments to remind yourself about what you did
        // Use comments to tell other programmers what you did
        // Debugging
        ////////////////////////////////////// GOOD ONES
        int age = 41;
        double centimetersInAnInch = 2.54;
        boolean wednesday = true;
        char middleInitial = 'A'; // 65
        
        ////////////////////////////////////// NOT AS GOOD ONES
        long milliseconds = 321928347;
        short atomicWeight = 23;
        byte bite = 1;
        float someDecimal = 4.25F;
        
        ////////////////////////////////////// REALLY COOL
        String name = "Dan Wang";
        String anotherAge = "32";
        String yetAnotherAge = "50";
        
        System.out.println(anotherAge + yetAnotherAge); // 3250
        
        // int doesThisWork = anotherAge + age; // String cannot be converted to int
        
        
        
        
        System.out.println(10*middleInitial); // 650
        System.out.println(middleInitial); // A
        System.out.println(middleInitial + "+" + middleInitial); // A + A
        
        double mashUp = age + centimetersInAnInch + middleInitial;
        System.out.println(mashUp); // 41 2.54 A
        System.out.println();
        System.out.println(age + " " + centimetersInAnInch + " " + middleInitial); // 41 2.54 A
        
        
        // Because Strings are a class, they have METHODS
        // And you can do cool things with methods
        // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
        
        String firstName = "Dave";
        System.out.println(firstName);
        System.out.println(firstName.length());
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.toUpperCase());
        
        System.out.println();
        
        // UNDER PENALTY OF PAIN!!!!!!!
        String LastName = "Ghidiu";
        String MIDDLE_NAME = "Ryan";
        
        // When to use capitals - CONSTANTS
        final double PI = 3.14;
        final double SALES_TAX = .075; 
        
        // PI = 3.1459; CANNOT CHANGE A FINAL!!!!!!
        
        
        
        
        
        
        
         
         
        System.out.println("GAME OVER MAN!");
    }
}











