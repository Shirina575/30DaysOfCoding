import java.io.*;
import java.util.*;

class Person{
    int age;
    Person(int initialAge){
        if(initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
            }else{
                age = initialAge;
            }
        
        }
        public void amIOld(){
            if(age < 13)
                System.out.println("You are young.");
            else if(age >= 13 && age < 18)
                System.out.println("You are a teenager.");
            else
                System.out.println("You are old.");
        }
        
        public void yearPasses(){
            age += 1;
        }
    }

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i = 0; i < testCase; i++){
            int personAge = scan.nextInt();
            Person person = new Person(personAge);
            person.amIOld();
            for(int j = 0; j < testCase; j++){
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scan.close();
    }
}
