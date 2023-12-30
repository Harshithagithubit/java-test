package com.java;
import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer>elements=new ArrayList<>();
		elements.add(4);
		elements.add(5);
		elements.add(0);
		elements.add(9);
		elements.add(8);
		elements.add(10);
		System.out.print("list1 : ");
		for(int i=0;i<elements.size()/2;i++) {
			System.out.print(elements.get(i)+" ");
		}
		
		System.out.println(" ");
		elements.remove(0);
		elements.remove(1);
		elements.remove(2);
		System.out.println("list2:"+elements);
		
		

	
		/*int sum=0;
		for(int i=0;i<elements.size()/2;i++) {
			//sum=sum+elements.get(i);
			System.out.println(elements.get(i)+" ");
		}*/
		
		
		
		/*System.out.println(sum);
		int average=sum/5;
		System.out.println(average);*/
		
	}

}
