import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>a1=new LinkedList<>();
		a1.add("hi");
		a1.add(1,"hello");
		a1.addFirst("sree");
		a1.add("nano");
		a1.add("hello");
		a1.add("hi");
		a1.addLast("sravs");
		a1.removeFirst();
		a1.removeLast();
		a1.removeFirstOccurrence("hello");
		a1.removeLastOccurrence("hi");
	
		System.out.println(a1);
       System.out.println(a1.size());
		System.out.println(a1);
		
		 
		  
	}
}
