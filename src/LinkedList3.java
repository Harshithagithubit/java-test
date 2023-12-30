import java.util.*;
public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> list= new LinkedList<Integer>(); 
	        list.add(123); 
	        list.add(12); 
	        list.add(11); 
	        list.add(1134); 
	        System.out.println("LinkedList: "+ list);
	        Collections.synchronizedList(list);
	        System.out.println("LinkedList: "+ list);
	        Object[] a = list.toArray(); 
	        System.out.print("After converted LinkedList to Array: " ); 
	        for(Object nums: a) 
	            System.out.print(nums+" "); 
	   
	}

}