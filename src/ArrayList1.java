import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arr1=new ArrayList<>();
		ArrayList<String>arr2=new ArrayList<>();
		arr2.add("zani");
		arr2.add(1,"kanna");
		arr2.add("null");
		arr2.set(0,"sai");
		System.out.println(arr2);
		Collections.sort(arr2);
		for(String names:arr2) {
			System.out.println(names);
		}
		for(int i=0;i<5;i++) {
			arr1.add(i);
			}
		System.out.println(arr1);
	

	}

}