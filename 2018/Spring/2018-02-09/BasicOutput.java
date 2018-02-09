import java.util.Scanner;
// To get input, ALWAYS import a Scanner from java.util



public class BasicOutput {
    public static void main (String[] args) {
        
        int age;
        String name; 
        
        Scanner megaTron = new Scanner(System.in);
        // To get input, you need to INSTANTIATE (create) the Scanner
        // In this case, we've called the Scanner 'megaTron'
        
        
        System.out.print("What is your name? "); // prompt
        name = megaTron.nextLine(); // take that data and store it!
        
        System.out.print("Enter your age: ");
        age = megaTron.nextInt();
        // To store the input from the user, use '.nextInt()'
        
        // Echo
        System.out.println("Hello, " + name + ". How does it feel being " + age +"?");
        
    }
}
    
    
