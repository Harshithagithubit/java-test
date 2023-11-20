import  java.util.*;
public class Set1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(12);
		lhs.add(50);
		lhs.add(15);
		lhs.remove(12);
		System.out.println(lhs);
		for(Integer element:lhs) {
			System.out.println(element);
		}
		

	}

}
