import java.util.*;
public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String>ad=new ArrayDeque<>();
		ad.add("hani");
		ad.addFirst("pree");
		ad.addLast("lolo");
		ad.offer("sree");
		ad.offerFirst("kanna");
		ad.offerLast("bebo");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println();
		System.out.println(ad.contains("pree"));
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println();
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
	}

}
