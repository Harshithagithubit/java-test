
public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Navin");
		sb.append("reddy");
		System.out.println(sb);
		sb.deleteCharAt((2));
		System.out.println(sb);
	}

}
