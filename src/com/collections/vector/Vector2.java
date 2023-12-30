package com.collections.vector;
import java.util.*;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add("priya");
		v1.add("shivu");
		v1.add(0,"sashi");
		
		Vector v2=new Vector();
		v2.add(" nani");
		v2.add("saha");
		v2.add("siri");
		Vector v3=new Vector();
		v3.add("sai");
		v3.add("sahasra");
		System.out.println(v1);
		v1.addAll(0,v2);
		System.out.println(v1);
		System.out.println(v1.containsAll(v2));
		System.out.println(v1.containsAll(v3));
		v3.set(0,"sanvi");
		System.out.println(v3);
		Object[] arr=v1.toArray();
			System.out.println(Arrays.toString(arr));
		System.out.println(v1.get(2));
		v1.remove(0);
		System.out.println(v1);
		v1.remove("shivu");
		System.out.println(v1);
		v1.removeAll(v2);
		System.out.println(v1);
	
		System.out.println(v1.contains("nani"));
		v1.clear();
		System.out.println(v1);
		
		
	}

}
