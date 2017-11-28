 public static void displayArray(int[] arr) {
     
     System.out.print(arr[0]);
     
     for (int i = 1; i < arr.length; i++) {
         
         System.out.print(", " + arr[i]);
         
     }
     
     System.out.println();
 }
 
 public static void verifyArray(int[] arr) {
    
    int countOnes = 0;
    int countTwos = 0;
    int countFives = 0;
    int countTens = 0;
    int countTwenties = 0;
    int countJokers = 0;
    int count = 0;
    int erroneous = 0;
    
    for (int i = 0; i < arr.length; i++) {
        
        switch(arr[i]) {
            case 1:
                countOnes++;
                count++;
                break;
            case 2:
                countTwos++;
                count++;
                break;
            case 5:
                countFives++;
                count++;
                break;
            case 10:
                countTens++;
                count++;
                break;
            case 20:
                countTwenties++;
                count++;
                break;
            case 40:
                countJokers++;
                count++;
                break;
            default:
                System.out.println("This value has no home: " + arr[i] + " at element " + i);
                erroneous++;
                count++;
                break;
        }

    }
    
    System.out.println("ONES:\t\t" + countOnes);
    System.out.println("TWOS:\t\t" + countTwos);
    System.out.println("FIVES:\t\t" + countFives);
    System.out.println("TENS:\t\t" + countTens);
    System.out.println("TWENTIES:\t" + countTwenties);
    System.out.println("JOKERS:\t\t" + countJokers);
    System.out.println("----------------------------");
    System.out.println("TOTAL:\t\t" + count);
    System.out.println("ERRONEOUS:\t" + erroneous);
        
  }
