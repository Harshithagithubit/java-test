import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>names=new LinkedList<String>();
		LinkedList<String>names1=new LinkedList<String>();
		names.add("pree");
		names.add("shy");
		names.add(2,"ro");
		names.addFirst("mini");
		names.add("chn");
		names.add("shy");
		names.addLast("ro");
		names.remove(0);
		names.removeFirstOccurrence("shy");
		names.removeLastOccurrence("ro");
		names1.add("nik");
		names1.add("poo");
		names1.add("k3g");
		names1.add("pusp");
		names1.removeFirst();
		names1.removeLast();
		System.out.println(names1.size());

		//names.addAll(1,names1);//
		//System.out.println(names);//
		Iterator i=names.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        System.out.println(" ");
		  
		Iterator<String> itr=names.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
	}
		  names.addAll(1,names1);
			System.out.println(names);
			System.out.println(names.size());

			
			
		names.clear();
		System.out.println(names);
		
		 
		  
	}
}
