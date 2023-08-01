class Human{
	private int age ;
	private String name ;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
