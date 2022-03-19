import java.io.*;
import java.util.*;

//Generic class
class Printer<E>{
    
    //Generic method
    public void printArray(E [] arr){
        for(E element : arr){
            System.out.println(element);
        }
    }
    
}

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int arraySize = sc.nextInt();
        Integer[] integerArray = new Integer[arraySize];
        for(int i = 0; i < arraySize; i++){
            integerArray[i] = sc.nextInt();
        }
        
        arraySize = sc.nextInt();
        sc.nextLine();
        String [] stringArray = new String[arraySize];
        for(int i = 0; i < arraySize; i++){
            stringArray[i] = sc.next();
        }
        //Create generic objec of class Printer
        Printer<Integer> printArrayInt = new Printer<Integer>();
        Printer<String> printArrayStr = new Printer<String>();
        printArrayInt.printArray(integerArray);
        printArrayStr.printArray(stringArray);
        
        //Check if the Printer class has more than 1 methods if so print the message
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
        sc.close();
    }
}

