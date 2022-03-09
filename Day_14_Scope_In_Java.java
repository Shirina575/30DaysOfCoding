import java.io.*;
import java.util.*;

class Difference{
    private int[] elements;
    public int absMaximumDif;
    Difference(int[] arr){
        elements = arr;
    }
    public void computeDifference(){
        Arrays.sort(elements);  // this will sort the array then we only need to calculate difference between first and last element
        int maximumDifference = elements[elements.length - 1] - elements[0];
        absMaximumDif = Math.abs(maximumDifference);
        System.out.println(absMaximumDif);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        Difference def = new Difference(arr);
        def.computeDifference();
    }
}
