import java.util.*;
import java.util.Collection;
public class HashSet1 {

	public static void main(String[] args) {
		
	    HashSet<String>set=new HashSet();  
       set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five"); 
        set.add("Four");
        set.remove("Three");
        System.out.println(set);
        set.removeIf(str->str.contains("Four")); 
        System.out.println(set);
        
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())
        {  
        System.out.println(i.next());  
        } 
        System.out.println(set.contains("Two"));
        System.out.println(set.isEmpty());
		
	          /* HashSet<Integer> primeNumbers = new HashSet<>();
	            primeNumbers.add(2);
	            primeNumbers.add(3);
	            System.out.println("HashSet2: " + primeNumbers);

	            HashSet<Integer> evenNumbers = new HashSet<>();
	            evenNumbers.add(2);
	            evenNumbers.add(4);
	            System.out.println("HashSet3: " + evenNumbers);
	            
	         // Union of two set
	            evenNumbers.addAll(primeNumbers);
	            System.out.println("Union is: " + evenNumbers);
	            
	         // Intersection of two sets  
	            evenNumbers.retainAll(primeNumbers);
	            System.out.println("Intersection is: " + evenNumbers);
	        
	         // diff of two set
	           evenNumbers.removeAll(primeNumbers);
	            System.out.println("diff is is: " + evenNumbers);*/
	            
	            
	            
	        }
        
        


	}


