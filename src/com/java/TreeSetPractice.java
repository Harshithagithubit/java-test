package com.java;
import java.util.*;
public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(50);
		ts.add(5);
		ts.add(55);
		ts.add(15);
		ts.add(580);
		System.out.println(ts.subSet(5,600));
		System.out.println();
		System.out.println(ts.descendingSet());
		//System.out.println(ts);
		ts.remove(15);
		System.out.println(ts);
		for(Integer element:ts) {
			System.out.println(element);
		}
		System.out.println();
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollLast());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.subSet(5,600));
		

	}

}
