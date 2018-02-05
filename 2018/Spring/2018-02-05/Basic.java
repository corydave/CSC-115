// Dave Ghidiu
// Feb 5, 2018
// These notes will cover Chapter 2: BASIC JAVA

public class Basic {
    
    public static void main (String[] args) {
        
        int numOfEggs;
        // This is an integer (whole number)
        // it is called 'numOfEggs'
        // and the value is ------------
        //
        // We say that this variable has been DECLARED
        // but it has not yet been ASSIGNED
        
        numOfEggs = 30;
        // Now we have ASSIGNED a value to 'numOfEggs'
        
        // int numOfEggs = 100; // DECLARED & ASSIGNED
        
        System.out.println("Number of eggs: " + numOfEggs);
        System.out.println("Number of dozens of eggs: " + (numOfEggs/12) );
        System.out.println(5.0/2.0); // 2.5
        System.out.println(5.0/2); // 2.5
        System.out.println(5/2.0); // 2.5
        // "Automatic Promotion": In mixed-mode arithmetic, the
        // types will be promoted to the least restrictive type
        
        int num1 = 60;
        int num2 = 50;
        
        System.out.println(1.0*num1/num2); // Works, but not ideal
        
        System.out.println(((double)num1)/num2); // The right way!
        // This is called "CASTING". CASTING is when you temporarily
        // turn one type into another
        
        System.out.println((double)num1/num2);
        // PEMDAS!!!!
        
        System.out.print("HI");
        System.out.println("HI");
        
        // ESCAPE CHARACTERS
        //   n = new line
        System.out.print("Hi\n\n\n\n\n\n\n\n");
        System.out.print("H\ni");
        
        //   t = tab
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\tHi");
        
        //   \ = \
        System.out.println("\\");
        
        //   " = "
        System.out.println("I don't \"shower\" ");
        https://www.youtube.com/watch?v=Xv2VIEY9-A8
        
        //   ' = '
        System.out.println("\'");
        
        // STRING
        
        // A whole bunch of characters (AKA 'word'), use 'String'
        // String is a class, but we can use it like a PDT
    
        String firstName = "Dave";
        System.out.println(firstName);
        
        String age = 39;
        System.out.println(age+1);
        
        
    }
    
    
}















