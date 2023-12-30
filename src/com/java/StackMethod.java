package com.java;
import java.util.*;
public class StackMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> books= new Stack<>();  
		System.out.println("Is the stack empty? " + books.empty()); 
		books.push("red");
		books.push("orange");
		books.push("pink");
		books.push("null");
		books.push("green");
		books.remove(1);
		books.set(3,"purple");
		System.out.println(books.contains("pink"));
		System.out.println(books.get(2));
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books.search("red"));
		System.out.println(books.indexOf("red"));
		
		/*System.out.println(sk.pop());
		//System.out.println(sk.peek());
		//System.out.println("The stack size is: "+sk.size());
		System.out.println(" ");
		Iterator itr = sk.iterator();  
		//while(itr.hasNext()) */ 
		//{   
		//System.out.println(itr.next());   
		//}     
		/*sk.forEach(n ->{  
		System.out.println(n); }
		);  
		System.out.println(" ");*/
		
		
		
		

	}

}
