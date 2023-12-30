package com.java;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		
		// creation of a map
		Map<Integer,String>m1=new LinkedHashMap<>();
		m1.put(101,"harshitha");
		m1.put(106,"kavitha");
		m1.put(103,"ganganna");
		m1.put(104,"akshay");
		//System.out.println(m1);//
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		//Set<Integer>keys=m1.keySet();//
		for(Integer key:m1.keySet()) {
			System.out.println(key+" "+m1.get(key));
		}
		for(Integer key:m1.keySet()) {
			System.out.println((key));
		}
		System.out.println();
		//Collection<String> values=m1.values();
		for(String value:m1.values()) {
			System.out.println((value));
		}
		System.out.println();
		System.out.println(m1.get(104));
		m1.remove(103,"ganganna");
		System.out.println(m1);
		System.out.println(m1.containsKey(102));
		System.out.println(m1.containsValue("saritha"));
		m1.replace(101,"chikky");
		System.out.println(m1);
		System.out.println(m1.size());
		m1.clear();
		System.out.println(m1);
		
		

	}

}
