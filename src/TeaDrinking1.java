import java.util.Map;
import java.util.HashMap;
public class TeaDrinking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> members=new HashMap<>();
		members.put("Arun",3);
		members.put("Jaya",4);
		members.put("shailu", 5);
		members.put("Akshay",2 );
		
		System.out.println(members.keySet());
		for(String name:members.keySet())
		{
			System.out.println(name+"  " +"drank"+"  "+ members.get(name)+"  "+"cupsoftea");
		}
		
	}

}
