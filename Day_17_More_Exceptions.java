import java.io.*;
import java.util.*;


class Calculator{
    public int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception();
        }
        else{
            return (int)Math.pow(n,p);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Calculator cl = new Calculator();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int p = sc.nextInt();
            try{
                
                int result = cl.power(n,p);
                System.out.println(result);
            }catch(Exception e){
                System.out.println("n and p should be non-negative");
            }
        }
    }
}
