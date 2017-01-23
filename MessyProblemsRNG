import java.util.ArrayList;
import java.util.Random;

public class MessyProblemsRNG {

     public static void main(String []args){
        ArrayList<String> namesOfStudents = new ArrayList<String>();
        namesOfStudents.add("Jacky");
        namesOfStudents.add("Colin");
        namesOfStudents.add("Kevin");
        namesOfStudents.add("Khari");
        namesOfStudents.add("Christian");
        namesOfStudents.add("Eddie");
        namesOfStudents.add("Ethan");
        namesOfStudents.add("Patrick");
        namesOfStudents.add("Gage");
        namesOfStudents.add("Jonah");
        namesOfStudents.add("Charles");
        namesOfStudents.add("Oliver");
        namesOfStudents.add("Nate");
        namesOfStudents.add("Florida");
        namesOfStudents.add("Tyler");
        namesOfStudents.add("Anthony");
        
        Random rand = new Random();
        
        for (int i = namesOfStudents.size()-1; i >= 0; i--) {
            int randomNumber = rand.nextInt(namesOfStudents.size());
            System.out.println(namesOfStudents.get(randomNumber) + " is assigned problem " + (i + 1));
            namesOfStudents.remove(randomNumber);
        }
     }
}

/*

Tyler is assigned problem 16
Jonah is assigned problem 15
Patrick is assigned problem 14
Kevin is assigned problem 13
Florida is assigned problem 12
Oliver is assigned problem 11
Nate is assigned problem 10
Khari is assigned problem 9
Christian is assigned problem 8
Gage is assigned problem 7
Charles is assigned problem 6
Eddie is assigned problem 5
Colin is assigned problem 4
Ethan is assigned problem 3
Jacky is assigned problem 2
Anthony is assigned problem 1


*/
