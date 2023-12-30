package com.java;

public class Demo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=9;
		int n2=0;
		int result=0;
		
		try {
		int result1=n1/n2;
     	}
		catch(ArithmeticException ae) {
		  System.out.println(ae.toString());
		}
	   System.out.println(result);
	}

}
