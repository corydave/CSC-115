public class Conditionals01 {
    public static void main (String[] args) {
        
        boolean beforeNoon = true;
        
        System.out.println("Hi there!");
        
        
        if (beforeNoon == true) {
            System.out.println("Good morning!");
        }

        // ===================

        int testNum = 0;
        
        if (testNum > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // ===================
        
        int testNum2 = 0;
        
        if (testNum2 > 0) {
            System.out.println("Positive");
        } else if (testNum2 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("NEITHER!");
        }

        // ===================

        boolean alwaysFalse = false;
        
        if (alwaysFalse == true) {
            System.out.println(10/0);
        }

        // ===================
        
        
        
        
        
        
        
        
        
        
        System.out.println("GAME OVER MAN!");
        
    }
}












        // while (true) {
        //     System.out.println("Uh-oh");
        // }
