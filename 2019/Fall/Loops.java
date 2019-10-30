    import java.util.Scanner;
    import java.util.Random;
    
    public class Loops {
        public static void main (String[] args) {
            
            int counter = 1;
            
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            
            // System.out.println("DEBUG: number = " + number);
            
            System.out.println("Enter a guess between 1 and 100");
            int guess = scanner.nextInt();
            
            // while (true) {
            while (counter < 3) {
                
            
                if (guess == number) {
                    System.out.println("You got it!");
                    break;
                } else if (guess < number) {
                    System.out.println("Guess higher");
                } else {
                    System.out.println("Guess lower");
                }
                
                System.out.println("\nEnter another guess between 1 and 10");
                guess = scanner.nextInt();
                
                counter++;
                
            }           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // while (guess != number) {
            
            //     if (guess < number) {
            //         System.out.println("Guess higher");
            //     } else if (guess > number) {
            //         System.out.println("Guess lower");
            //     }
                
            //     System.out.println("\nEnter another guess between 1 and 10");
            //     guess = scanner.nextInt();
                
            // }        
            
            System.out.println("YOU GOT IT! The number was " + number);
            System.out.println("It took you " + counter + " guess(es).");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                
            // while (true) {
                
                
                // System.out.println("HI!");
            // }    
            
            
            // while (counter <= 10000000) {
                
            //     System.out.println(counter);
            //     // counter = counter * 2;
            //     counter++;
            //     counter += 1;
            //     // counter *= 2;
            //     counter--;
            // }
            
            
            
            // System.out.println(0);
            
            
            
            
            System.out.println("Game Over Man!!!");
            
            
            
        }
    
