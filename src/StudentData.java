class MyFriend {
	private int salary;
	private String name;
	 
	public MyFriend(int mySalary,String myName) {
		salary=mySalary;
		name=myName;
		
		}
	
	public void  setSalary(int Salary) {
		this.salary=salary;
		
	}
	public int getSalary (){
		return salary;
		
	}
	public void  setName(String name) {
		this.name=name;
		
	}
	public String getName(){
		return name;
		
	}
	
	
}
public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFriend honey=new MyFriend(10000,"honey");
       System.out.println(honey.getSalary());
       System.out.println(honey.getName());
       
       
	}

}
