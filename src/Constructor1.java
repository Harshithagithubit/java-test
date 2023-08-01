class Men
{
	private int age;
	private String name;
	
	public Men(){
		 age =20;
		name = "hari";
	}
	public Men(int age,String name) {
		this.age =age;
	    this.name=name;
	}

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
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Men obj = new Men();
       Men obj1 = new Men(18,"harishrao");
       System.out.println(obj.getName()+":"+obj.getAge());
       System.out.println(obj1.getName()+":"+obj1.getAge());
	   
    		   
	}

}
