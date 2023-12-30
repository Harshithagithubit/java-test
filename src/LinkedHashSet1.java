import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		LinkedHashSet<String> hs = new LinkedHashSet<String>(); 
		  // insertorder is maintained 
        hs.add("Geek"); 
        hs.add("For"); 
        hs.add("Geeks"); 
        hs.add("1");
        hs.add("A");
        hs.add("a");
        hs.remove("A");
        System.out.println(hs.remove("B"));
        System.out.println(hs.contains("l"));
        System.out.println(hs.isEmpty());
        System.out.println("LinkedHashSet : " + hs); 
        Iterator itr = hs.iterator(); 
         while (itr.hasNext()) 
            System.out.print(itr.next() + ", "); 
        System.out.println(" "); 
        for(String i:hs) {
        	System.out.println(i);
        }

	}

}
