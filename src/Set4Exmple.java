import java.util.*;
public class Set4Exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer>s1=new TreeSet<>();
		s1.add(3);
		s1.add(6);
		s1.add(12);
		s1.add(61);
		System.out.println(s1);
		s1.remove(12);
		System.out.println(s1);
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.contains(61));
		for(Integer num:s1) {
			System.out.println(num);
		}
		
	}

}
