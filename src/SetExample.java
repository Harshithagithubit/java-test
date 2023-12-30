import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>data=new LinkedHashSet<Integer>();
		
		data.add(31);   
        data.add(21);   
        data.add(41);  
        data.add(91);   
        data.add(71);   
        data.add(81);
        data.remove(21);
        System.out.println(data.remove(91));
		System.out.println(data.isEmpty());
		System.out.println(data.size());
		System.out.println(data.contains(31));
		System.out.println(data.containsAll(data));
		System.out.println(data.hashCode());
		List<Integer>Data=new ArrayList<Integer>();
		Data.add(91);   
	    Data.add(71);   
	    Data.add(81);  
		System.out.println(Data.get(1));
		Data.addAll(data);
		
		System.out.println(Data);
		System.out.println(" ");
		Iterator itr1=Data.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println(" ");
		data.retainAll(Data);      
        System.out.println("data after retaining newdata elements : " + data);     
		

	}

}
