import java.io.*;
import java.util.*;

public class Solution {
    /*Create Instance variable stack and queue of Stack and Queue Type
    Note Queue is abstract so no instance can be created of Queue type but queue instance can be created of LinkedList type since Queue can be implemented using LinkedList
    */
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
    
    //Push element to stack
    void pushCharacter(char ch){
        stack.push(ch);
    }
    //enqueue element to queue
    void enqueueCharacter(char ch){
        queue.add(ch);
    }
    //pop element from the stack
    char popCharacter(){
        return stack.pop();
    }
    //dequeue element from the queue
    char dequeueCharacter(){
        return queue.remove();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Solution palindromCheck = new Solution();
   
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        //convert the string to an array of type char
        char[] in = s.toCharArray();
        //push and enqueue all elements in array in
        for(char ch : in){
            palindromCheck.pushCharacter(ch);
            palindromCheck.enqueueCharacter(ch);
        }
        //check is the string is a palindrome
        boolean isPalindrome = true;
        for(int i = 0; i < in.length / 2; i++){
            if(palindromCheck.popCharacter() != palindromCheck.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }
        //finally print the output
        System.out.println("The word, " + s + ", is" + (isPalindrome ? " a palindrome.": " not a palindrome."));
    }
}

