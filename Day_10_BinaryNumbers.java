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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int  count = 0, max = 0;
        while(n > 0){
            int rem = n % 2;
            if(rem == 1){
                count += 1;
            }else{
                count = 0;
            }
            max = Math.max(count, max);
            // above line will give use the maximum number of consecutive 1's in binary for the given number
            n /= 2;
            
        }
        
        System.out.println(max);

        bufferedReader.close();
    }
}
