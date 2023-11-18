import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>naam=new ArrayList<>();
		naam.add("sisi");
		naam.add("bebo");
		LinkedList<String>names=new LinkedList<>();
		names.add("sari");
		names.add("gama");
		names.add("pada");
		names.add(3,"nisa");
		names.add("lulu");
		names.set(4,"hari");
		names.remove("gama");
		names.remove(1);
		names.addAll(0,naam);
		System.out.println(names);
		System.out.println(names.get(2));
		names.removeAll(naam);
		
		System.out.println(names);
	
		names.clear();
		System.out.println(names);
		
		
		
		
		
		
		
		
		

		/*nums1.add(67);
		nums1.add(34);
		nums.addAll(nums1);
		System.out.println(nums);
		
		Iterator<Integer> itr=nums.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  */
		  }
		
		 
        

	

}
