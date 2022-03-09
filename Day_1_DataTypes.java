import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner scan = new Scanner(System.in);
        int integerVar = scan.nextInt();
        double doubleVar = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        scan.close();
        
        System.out.println(i + integerVar);
        System.out.println(d + doubleVar);
        System.out.println(s +" " + str);
    }
}
