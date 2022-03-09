/*
Book class can be declared using only title and author variable and a constructor of 2 parameter instead of 3
in that case MyBook class must have extra properties like a price variable
*/

import java.io.*;
import java.util.*;

abstract class Book{
    public String title;
    public String author;
    protected int price;
    
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    abstract public void display();
}

class MyBook extends Book{
    // private int price;
    
    MyBook(String title, String author, int price){
        super(title, author, price);
        // this.price = price;
    }
    
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        sc.close();
        
        Book newBook = new MyBook(title, author, price);
        newBook.display();
    }
}
