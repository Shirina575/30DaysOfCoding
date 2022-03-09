import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int number = sc.nextInt();
            sc.nextLine();
            phoneBook.put(name, number);
        }
        while(sc.hasNext()){
            String name = sc.nextLine();
            if(phoneBook.get(name) != null){
                System.out.println(name + "=" + phoneBook.get(name));
            }else{
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
