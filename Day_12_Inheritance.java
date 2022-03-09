import java.io.*;
import java.util.*;

class Person{
    private String firstName, lastName;
    private int idNumber;
    
    Person(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
}

class Student extends Person{
    
    private int[] scores;
    Student(String firstName, String lastName, int idNumber, int[] scores){
        //Geting first name, las name and id from super class Person
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }
    
    ////Grade calculation function
    public char calculate(){
        char grade = ' ';
        int avg = 0, sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
            avg = sum / scores.length;
            grade = avg >= 90 ? 'O' : avg >=80 ? 'E' : avg >=70 ? 'A' : avg >=55 ? 'P' : avg >=40 ? 'D' : 'T';
        }
        return grade;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int scoreCounts = sc.nextInt();
        int[] scores = new int[scoreCounts];
        for(int i = 0; i < scoreCounts; i++){
            scores[i] = sc.nextInt();
        }
        
        sc.close();
        
        Student newStudent = new Student(firstName, lastName, id, scores);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + newStudent.calculate());
    }
}
