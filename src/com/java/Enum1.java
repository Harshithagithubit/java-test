package com.java;
import java.util.*;
import java.util.EnumSet;
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<days> s = EnumSet.of(days.TUESDAY, days.WEDNESDAY);    
	   Iterator<days> iter = s.iterator();  
	   while (iter.hasNext())  
	    System.out.println(iter.next());  
	   System.out.println(" ");
	  //creating a set 
	EnumSet<days>set1, set2, set3,set4, set5;
	  // Adding elements 
    set1 = EnumSet.of(days.SUNDAY,days.MONDAY,days.TUESDAY,days.WEDNESDAY,days.THURSDAY);
    set2 = EnumSet.complementOf(set1); 
    set3 = EnumSet.allOf(days.class);
    set4 =EnumSet.noneOf(days.class);
    set5= EnumSet.range(days.WEDNESDAY,days.SATURDAY); 
    System.out.println( set1); 
    System.out.println(set2); 
    System.out.println(set3); 
    System.out.println(set4);
    System.out.println(set5);
    
    

		

}
}


