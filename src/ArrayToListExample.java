import java.util.*;
public class ArrayToListExample {

	public static void main(String[] args) {
	
		
		ArrayList<String>a2=new ArrayList<>(Arrays.asList("baby","soap","chalk","baby","soap","shampoo","baby"));
		System.out.println(a2);
		int count=Collections.frequency(a2,"baby");
		System.out.println("baby-"+count);
		int count1=Collections.frequency(a2,"soap");
		System.out.println("soap-"+count1);
		System.out.println("soap-"+Collections.frequency(a2,"soap"));
		
		List<Integer>l1=Arrays.asList(1,2,3,4,4,5);
		List<Integer>l2=(Arrays.asList(6,4,8,5,10,1));
		List<Integer>l=new ArrayList<>(l1);
		l.retainAll(l2);
		System.out.println("common element"+l);
		
		
		  
		}  
		 
      }
     
	


