import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    
    public static int bubbleSort(int[] a, int n){
        int numberOfSwaps = 0;
        for(int i = 0; i < n; i++){//To traverse all the array items
            
            int temp;
            for(int j = 0; j < n - 1; j++){//compare two adjacent element then swap
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps == 0){//no elements are swapped, so the array is sorted
                break;
            }
        }
        return numberOfSwaps;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();

        // Write your code here
        int numSwaps = bubbleSort(a, n);
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}

