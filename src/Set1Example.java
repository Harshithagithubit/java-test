import  java.util.*;
public class Set1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>pr=new HashSet<>();
		pr.add(2);
		pr.add(3);
		pr.add(7);
		pr.add(5);
		pr.add(11); 
		HashSet<Integer>odd = new HashSet<>();
        odd.add(5);
        odd.add(3);
        odd.add(12);
       /* odd.addAll(pr);
        System.out.println(odd);*/
       pr.retainAll(odd);
        System.out.println("Intersection is:" +pr);
        pr.removeAll(odd);
        System.out.println(pr);
       
		
		/*for(Integer element:lhs) {
			System.out.println(element);
		}
		*/

	}

}
