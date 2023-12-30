
package com.collections.vector;
public class Student{
   public static void main(String[] args) {
		
		String[] s1={"chai","coffee"};
		String[] s2={"coke","milk"};
		String[] s3=new String[s1.length+s2.length]; 
	    int count = 0;
	    for(int i = 0; i < s1.length; i++) { 
	         s3[i] = s1[i];
	         count++;
	      } 
	    for(int i = 0; i < s2.length;i++) { 
	         s3[count++] = s2[i];
	      } 
	    for(int i = 0;i < s3.length;i++) { 
	    	System.out.print(s3[i]+" ");
	   } 
	}
}

