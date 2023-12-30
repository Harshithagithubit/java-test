package com.java;

import java.util.*;
import java.util.List;


public class Test16 {

	public static void main(String[] args) {
		List<Integer>L1=new ArrayList<Integer>();
        L1.add(3);
		L1.add(7);
        L1.add(10);
		L1.add(14);
		L1.add(16);
		
		
		
	
	    for(int i=0;i<L1.size();i++) {
			
		if(L1.get(i)>5) {
			System.out.println(L1.get(i)+"is greater than 5");
		}
		else  {
			System.out.println(L1.get(i)+"is lesser than 5");
		}
		
		}
	
	}
  

 

	}


