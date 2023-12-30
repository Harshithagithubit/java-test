package com.java;
import java.util.*;  
public class ListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in string we can add integers in doublequotes
		Stack <String> stk = new Stack<>();  
		stk.push("hari");  
		stk.push("8");  
		stk.push("rama");
		stk.push("kanna");
		System.out.println(stk.search("rama"));
		ListIterator<String> ListIterator = stk.listIterator(stk.size());   
		while (ListIterator.hasPrevious())   
		{  
		//String name = ListIterator.previous();  
		System.out.println(ListIterator.previous() );  
		}  

	}

}
