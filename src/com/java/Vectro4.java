package com.java;
import java.util.*;
public class Vectro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(4);
		al.add(9);
		al.add(8);
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(5);
		ll.add(0);
		ll.add(10);
		ll.addAll(0,al);
		System.out.println(ll);		

	}

}
