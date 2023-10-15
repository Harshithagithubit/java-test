class Phone{
	public void on(){
		System.out.println("turn on");
		}
	public void ring() {
		System.out.println("phone is ringing");
	}
}
class SmartPhone extends Phone{
	public void ring() {
		System.out.println("Smartphone is ringing");
	}
	public void music() {
		System.out.println("music playing");
	}
	
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Phone obj=new SmartPhone();
     obj.ring();
     obj.on();
          
     
	}

}
