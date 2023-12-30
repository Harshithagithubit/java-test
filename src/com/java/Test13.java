package com.java;
class Calculator{
	public int add (int n1,int n2)
	{
		return n1+n2;
	}
    public int add1(int n1,int n2,int n3) {
    	return n1+n2+n3;
    }
}
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator obj = new Calculator();
      int r1=obj.add(4, 5);
      int r2 =obj.add1(4, 2,3);
      System.out.println(r1+r2);
      
	}

}
