package com.java;

	class Animal{
	    public  Animal(){
	        System.out.println("My class consists of all the animals as the name speaks for itself");
	    }
	    public void location(){
	        System.out.println("We live in the jungle");
	    }
	}

	class Dog extends Animal{
	    public void shout(){
	        System.out.println("Bow Bow");
	    }
	    public void speak(){
	        System.out.println("Hi, My name is lewis");
	    }
	
	}



public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog obj=new Dog();
    obj.shout();
    
    
	}

}
