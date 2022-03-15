import java.io.*;
import java.util.*;

class Node{
    Node next;
    int data;
    Node(int newData){
        next = null;
        data = newData;
    }
}
public class Solution {
    
    public static Node insert(Node head, int data){
	//insert data and return a new head
        if(head == null){
            return new Node(data);
        }else{
            head.next = insert(head.next, data);
        }
        return head;
    }
    
    public static void display(Node startNode){
        Node start = startNode;
        while(start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int ref = sc.nextInt();
        for(int i = 0; i < ref; i++){
            int input = sc.nextInt();
            head = insert(head, input);
        }
        display(head);
        sc.close();
    }
}

