import java.io.*;
import java.util.*;

class Node{
    Node left, right;
    int data;
    
    //This will return a new node
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Solution {
	//This will return the height of the tree
    public static int getheight(Node root){
        if(root == null){
            return -1;
        }
        //Compare depth in left and right sub tree
        return Math.max(getheight(root.left), getheight(root.right)) + 1;
    }
    
    //Insert data to the BST and return a new root either left or right
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node current;
            if(data < root.data){
                current = insert(root.left, data);
                root.left = current;
            }else{
                current = insert(root.right, data);
                root.right = current;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getheight(root);
        System.out.println(height);
    }
}
