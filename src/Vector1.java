import java.util.*;
public class Vector1 {

	public static void main(String[] args) {  
    Vector<String> vec = new Vector<String>();   
     vec.add("Tiger");  
     vec.add("Lion");  
     vec.add("Dog");  
	 vec.add("Elephant");  
	 vec.add("Lion");
     vec.addElement("Rat");  
	 vec.addElement(" Cat");
	 vec.addElement("Deer");
     vec.addElement("Lioness");
	 vec.set(0,"Cheetah");
     vec.insertElementAt("Monkey",7 );
System.out.println("Elements are: "+vec);
System.out.println(vec.lastIndexOf("Lion"));
System.out.println( vec.get(2));  
System.out.println("Size is: "+vec.size());  
System.out.println("Default capacity is: "+vec.capacity()); 
System.out.println("Tiger is present at the index " +vec.indexOf("Lion"));
		    //Get the first element  
System.out.println("The first animal of the vector is = "+vec.firstElement());   
		          //Get the last element 
System.out.println("The last animal of the vector is = "+vec.lastElement()); 
 vec.removeElementAt(5);
 System.out.println(vec); 
 System.out.println(vec.remove(4));
 System.out.println(vec.remove("Deer"));
 System.out.println("Hash code of this vector = "+vec.hashCode()); 
 
for (int i = 0; i < vec.size(); i++)
{
  
System.out.print(vec.get(i) + " ");
}
	}
}
		          
		          
		        
		

	


