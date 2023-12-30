import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String>l=new ArrayList<>();
		List<String>l1=new ArrayList<>();
	    l.add("hari");
		l.add(1,"honey");
		l.add("preeti");
		l.add("tna");
		l.set(2,"shiva");
		l.remove(3);
		l1.add("hy");
		l1.add("hlo");
		l1.add("hiii");   
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.indexOf("shiva"));
		System.out.println(l.contains("honey"));
		l1.addAll(3,l);
		System.out.println(l1);
		l.removeAll(l);//clear(l)
		System.out.println(l);
		System.out.println(l1.size() +" " +"insize");
		System.out.println(l1.isEmpty());
		
		

	}

}
