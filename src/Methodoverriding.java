class Vehicle{
	public void brake() {
		System.out.println("i have  brakes");
	}
	public void tyre() {
		System.out.println("i  have tyres");
	}
}
class Bike extends Vehicle{
	public void tyre() {
		System.out.println("i have 2 tyres");
	}
	
	public void engine() {
		System.out.println("vehicle engine");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Bike();
		obj.tyre();
		Vehicle obj1=new Vehicle();
		obj1.tyre();

	}

}
