import java.util.*;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l1=new ArrayList<String>();
		l1.add("shailu");
		l1.add("hanu");
		l1.add("ganga");
		l1.add("hari");
		l1.add("rama");
		l1.set(2,"akki");
		l1.remove(0);
		l1.remove("rama");
		
		
		System.out.println("Is ArrayList Empty: "+l1.isEmpty());  
		System.out.println("The size of the array is: " + l1.size());  
		
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		System.out.println(l1.get(1));
		System.out.println(" ");
		
		Collections.sort(l1);
		for(String name:l1) {
			System.out.println(name);
	}
		
		
	}

}
