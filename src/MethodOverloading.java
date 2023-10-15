

public class MethodOverloading {
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	public double sum(double x,double y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m =new MethodOverloading();
		System.out.println(m.sum(4, 10));
		System.out.println(m.sum(45,54.8));

	}

}
