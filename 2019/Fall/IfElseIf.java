// http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

import java.util.*;

public class IfElseIf {

    // public static Scanner scanner = new Scanner(System.in); // GLOBAL variable  
    public static String test = "YAY! I'm Global!"; // Global variables are usually bad
    public static int age = 40;
    public static final boolean DEBUG = false;
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter a grade:");
        // int grade = scanner.nextInt();

        int grade = 0;
        
        if (DEBUG == true) {
            
            System.out.println(test);
            System.out.println(age);
            
            justIfs(grade);
            makeSpaces();
            ifsAndElses(grade);
            makeSpaces();
            compoundIfs(grade);
            makeSpaces();
            orDemo(grade);
            
        }
        
        System.out.println("Enter a letter grade");
        char letterGrade = scanner.nextLine().charAt(0);
        
        switchDemo(letterGrade);
        
    }
    
    public static void switchDemo(char letterGrade) {
        
        System.out.println("switchDemo is running!");
        System.out.println(letterGrade);
        
        switch (letterGrade) {
            case 'A': System.out.println("90-100");
                      break;
            case 'B': System.out.println("80-89");
                      break;            
            case 'C': System.out.println("70-79");
                      break;            
            case 'D': System.out.println("60-69");
                      break;            
            case 'F': System.out.println("0-59");
                      break;    
            default:  System.out.println("Error! Out of range!");
                      break;            
        }
        
        
    }
    
    
    public static void orDemo(int grade) {
        
        // System.out.println("Enter your name:");
        // String name = scanner.nextLine();
        
        int age = 30; // LOCAL variable
        
        if (grade < 0 || grade > 100) {
            System.out.println("ERROR: GRADE out of range");
        }
        
        if ((grade >= 0 && grade < 100) || (grade == -30)) {
            System.out.println("-30 is the EASTER EGG!");
        }
        
        System.out.println(test);
        System.out.println(age);
    }
    
    public static void compoundIfs(int grade) {
        // Because, Greg.

        System.out.println("compoundIfs is running!");
        System.out.println(grade);
        
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("F");
        } else {
            System.out.println("Please enter a grade between 0 and 100!");
        }
        
        System.out.println(test);
        
        
    }    
    
    
    public static void makeSpaces() {
        System.out.println();
        System.out.println("=============");
        System.out.println();        
    }
    
    public static void justIfs(int grade) {
        
        System.out.println("justIfs is running!");
        System.out.println(grade);
        
        if (grade >= 90) {
            System.out.println("A");
        }
        
        if (grade >= 80) {
            System.out.println("B");
        }        
        
        if (grade >= 70) {
            System.out.println("C");
        }        
        
        if (grade >= 60) {
            System.out.println("D");
        }
        
        if (grade >= 0) {
            System.out.println("F");
        }        
        
    }
    
    public static void ifsAndElses(int grade) {
        
        System.out.println("ifsAndElses is running!");
        System.out.println(grade);
        
        if (grade >= 0) {
            System.out.println("F");
        } else if (grade >= 60) {
            System.out.println("D");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 90) {
            System.out.println("A");
        } else {
            System.out.println("WTF?");
        }
        
    }    
    
}




















