import java.util.Scanner;
import java.lang.Math;

public class NonVoidMethodExamples {

  public static void main (String args[]) {
  
    int num1 = 3;
    int num2 = 5;
    
    int sum = add(num1, num2);
    double answer = pythagoreanify(num1, num2);

    System.out.println("PYTH = " + answer);
    System.out.println("PYTH ON THE FLY = " + pythagoreanify(5, 12));
    
    System.out.println(num1 + " plus " + num2 + " = " + sum);
  
  }
  
//   public static double add(int a, int b) { // WON'T WORK!!!!
//   }

  public static int add(int a, int b) {
  
    return (a+b);
  
  }
  
  public static double pythagoreanify(int leg1, int leg2) {

//     int leg1Squared = leg1*leg1;
//     int leg2Squared = leg2*leg2;
//     double sum = leg1Squared + leg2Squared;
//     double sqrtOfSum = Math.sqrt(sum);

//     return sum;

    return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    
    
  }
  

}
