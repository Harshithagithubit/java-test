package com.java;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>naam=new ArrayList<>();
		naam.add("sisi");
		naam.add("bebo");
	     LinkedList<String>names=new LinkedList<>();
		names.add("sari"); //2
		names.add("gama"); //3
		names.addFirst("pada");//1
		names.add(3,"nisa"); //4=hari
		names.addLast("lulu"); //5
		names.set(4,"hari");
		names.remove("gama");
		//names.remove(1);//
		names.removeFirst();
		names.removeLast();
		names.addAll(0,naam);
		System.out.println(names.contains(1));
		System.out.println(names.indexOf("sari"));
		System.out.println(names.get(2));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		
		names.removeAll(naam);
		
		System.out.println(names);
	
		names.clear();
		System.out.println(names);
		
		
		
		
		
		
		
		
		

		/*nums1.add(67);
		nums1.add(34);
		nums.addAll(nums1);
		System.out.println(nums);
		
		Iterator<Integer> itr=nums.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  */
		  }
		
		 
        

	

}
