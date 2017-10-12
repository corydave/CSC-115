public class IfStatementsPartII {
  public static void main (String args[]) {
    
    int a = 10;
    int b = 20;
    int c = 30;
    
//     System.out.println(Math.max(Math.max(a, b), c));
    
    if (a > b) {
      if (a > c) {
        System.out.println("A is the biggest number!");
      }
    }
    
    if (b > a) {
      if (b > c) {
         System.out.println("B is the biggest number!");
      }
    }
    
    if (c > a) {
      if (c > b) {
        System.out.println("C is the biggest number!");
      }
    }
    
  }
}
