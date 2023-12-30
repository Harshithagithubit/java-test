package com.java;
class A
{
	public void show()
	{
		System.out.println("show A");
	}
}
public class Test15 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          A obj = new A() 
          {
    	   public void show()
    	   {
    			System.out.println(" new show ");
    	    }
    	 };
	   obj.show();  
	}
}
