public class BlowYerMind {
  public static void main (String args[]) { //#neverForget
  
    System.out.println("3 + 4"); // String literal
    System.out.println(3 + 4);
    
    System.out.println("3 + 4 = " + 3 + 4);
    System.out.println(3 + 4 + " = 3 + 4");    
    System.out.println(3 + 4 + " = 3 + 4 = " + 3 + 4);    
    System.out.println(3 + 4 + " = 3 + 4 = " + "3" + "4");    
    System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4));        
    
    
    
    // A good CONCATENATION
    System.out.println("#ROC" + "CON" + " " + "was neat-o");
  
    // Concatenation in the wild:
    String name = "Frank Castle";
    System.out.println("Your name is: " + name);
   
    // Teaser about CASTING and MIXED MODE ARITHMETIC
    System.out.println(1.0*11/2);
    System.out.println(3.5/2);
    System.out.println(4.00/2);    

    
  }
}
