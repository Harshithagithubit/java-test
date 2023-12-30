package com.java;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter ur physics marks");
		float m1=sc.nextFloat();
		System.out.println("enter ur maths marks");
		float m2=sc.nextFloat();
		System.out.println("enter ur english marks");
		 float m3=sc.nextInt();
		 float avg =(m1+m2+m3)/3.0f;
		System.out.println("ur overall percentage is "+avg);
		
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("u have passed");
		}
		else {
			System.out.println("u have failed");
		}

	}

}
