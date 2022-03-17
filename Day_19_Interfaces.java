import java.io.*;
import java.util.*;

//An Interface
interface AdvancedArithmetic{
    //Abstract Methods
    public int divisorSum(int n);
}
//new class implementing the AdvancedArithmetic interface
class Calculator implements AdvancedArithmetic{
    Calculator(){
        System.out.println("I implemented: AdvancedArithmetic");
    }
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }   
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Calculator cal = new Calculator();
        int sum = cal.divisorSum(n);
        System.out.println(sum);
    }
}

