import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < T; i++){
            String S = sc.nextLine();
            String SEven = "";
            String SOdd = "";
            char ch;
            for(int j = 0; j < S.length(); j++){
                if(j % 2 == 0){
                    ch = S.charAt(j);
                    SEven = SEven + ch;
                }else{
                    ch = S.charAt(j);
                    SOdd = SOdd + ch;
                }
            }
            
            System.out.println(SEven + " " + SOdd);
        }
        sc.close();
    }
}
