import java.util.*;

public class VoidMethodExamples {

  public static void main (String args[]) {
  
    Scanner scanner = new Scanner(System.in);
    
//     displayMenu();
    String str = "Power Rangers";
    mortyify("Voltron");
    mortyify(str);
    
    String a = "Shannon";
    mortyify(a);
    
//    mortyify();  // won't work because mortyify needs ONE String
//    mortyify(str, a); // won't work because mortyify needs ONE String
  
    rickify("School", "watching intergalactic TV!");
  
//     add(3, 4.0); // THIS WON'T WORK! 'add' needs two INTs!!!
//     add(3, (int)4.9); // perfectly cromulent code!

    add(3, 4);
    add(3, 4.0);
    
    aaron("six");
    aaron(7.0);
    aaron(-8);
    
    phil(18);
      
  }
  
  // "recursion" is when you call a method IN that method
  public static void phil(double a) {
    System.out.println("Phil says: " + a);
    phil(a); // "infinite recursion"
  }
  
  
  
//   public static void aaron(String a || double a) { // :(
//   }

  public static void aaron(double a) {

    String str = "";
    str += a;
    aaron(str);

//     aaron("" + a); // This code works, too!
  }
  
  public static void aaron(String a) {
    System.out.println("Aaron says: "  + a);
  }  

   
  public static void add(double a, double b) {
    System.out.println("The sum of " + a + " and " + b + " is " + (a+b));  
  }  

  // When you have two (or more!) methods with the same NAME, that's called
  // "overloading"
  
  public static void add() {
    System.out.println("Triple dipping!");
  }
  
  public static void add(int a, int b) {
    System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
  }
  
  
  public static void rickify(String a, String b) {
  
    System.out.println();
    System.out.println("Wubba lubba dub dub! " + a + " is a waste of time! We should be " + b); 
    System.out.println();  
  }
  
  
  // 'public' is the access modifier, and it (kinda) means
  // that any method in this "environment" can see it.
  
  // 'static' means you do not have to instantiate the class
  // to use it (like any method in the Math class). 99.9% of all
  // methods we do this semester will be static.
  
  // 'void' means there is no answer to give back to the main
  // program. 'void' methods just do their task and then
  // they are finished.
  
  public static void mortyify(String a) { // method signature
  
    System.out.println();
    System.out.println("Awww geeez man, I dunno about " + a);
    System.out.println();
      
  }
  
  
  public static void displayMenu() {
    System.out.println("displayMenu STUB");
  }  
  
  
  
}
