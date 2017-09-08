import java.util.ArrayList;
import java.util.Random;

public class MessyProblemsRNG {
     
     public static void main(String []args){
        ArrayList<String> namesOfStudents = new ArrayList<String>();
        namesOfStudents.add("Joey");
        namesOfStudents.add("Derek B");
        namesOfStudents.add("Aaron");
        namesOfStudents.add("Thomas");
        namesOfStudents.add("Nate");
        namesOfStudents.add("Sai");
        namesOfStudents.add("Phil");
        namesOfStudents.add("Evan");
        namesOfStudents.add("Derryck M");
        namesOfStudents.add("Shannon");
        namesOfStudents.add("Austin");
        namesOfStudents.add("Matt");
        namesOfStudents.add("Brent");
        namesOfStudents.add("Will");
        namesOfStudents.add("Nick Sch");
        namesOfStudents.add("Paige");
        namesOfStudents.add("Nick St");
        namesOfStudents.add("Nick T");
        namesOfStudents.add("Anna");
        namesOfStudents.add("Elijah");
        
        Random rand = new Random();
        
        for (int i = namesOfStudents.size()-1; i >= 0; i--) {
            int randomNumber = rand.nextInt(namesOfStudents.size());
            System.out.println(namesOfStudents.get(randomNumber) + " is assigned problem " + (i + 1));
            namesOfStudents.remove(randomNumber);
        }
     }
}

/*

Paige is assigned problem 20
Matt is assigned problem 19
Thomas is assigned problem 18
Joey is assigned problem 17
Anna is assigned problem 16
Elijah is assigned problem 15
Will is assigned problem 14
Phil is assigned problem 13
Sai is assigned problem 12
Brent is assigned problem 11
Nick St. is assigned problem 10
Aaron is assigned problem 9
Evan is assigned problem 8
Nate is assigned problem 7
Nick Sch is assigned problem 6
Austin is assigned problem 5
Shannon is assigned problem 4
Derryck M is assigned problem 3
Derek B is assigned problem 2
Nick T is assigned problem 1


*/
