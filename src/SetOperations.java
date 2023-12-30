import java.util.*;
public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] A = {22, 45,33, 66, 55, 34, 77};  
	        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
	        Set<Integer> set1 = new HashSet<Integer>();    
	        set1.addAll(Arrays.asList(A));    
	        Set<Integer> set2 = new HashSet<Integer>();    
	        set2.addAll(Arrays.asList(B));    
	    
	        Set<Integer> union= new HashSet<Integer>(set1);    
	        union.addAll(set2);    
	        System.out.println("Union of set1 and set2 is:"+union);    
	             
	        Set<Integer> intersection = new HashSet<Integer>(set1);    
	        intersection.retainAll(set2);    
	        System.out.println("Intersection of set1 and set2 is:"+intersection);    
	      
	        
	        Set<Integer> difference = new HashSet<Integer>(set1);    
	        difference.removeAll(set2);    
	        System.out.println("Difference of set1 and set2 is:"+difference);    
	        
	        
	}

}
