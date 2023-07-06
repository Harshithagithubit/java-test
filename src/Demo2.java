class Human{
	private int age ;
	private String name ;
	
  public int getAge() {
	              return age;
           }
  public String getName() {
      return name;
    }
  public void setAge(int a) {
      age=a;
}
public void setName(String n) {
 name=n;
}
}
  
public class Demo2 {

	public static void main(String[] args) {
		Human obj = new Human();
		 obj.setAge(30);
		 obj.setName("ram");
		
		System.out.println(obj.getName()+":"+obj.getAge());
		// TODO Auto-generated method stub

	}

}
