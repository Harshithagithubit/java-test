class Phone{
	public int add ( int n1,int n2) {
		return n1+n2;
		}
	}
class Smartphone extends Phone{
	public int add(int n1,int n2) {
		return n1+n2+1;
	}
}
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Smartphone obj = new Smartphone();
      int r1=obj.add(7, 4);
      System.out.println(r1);
	}

}
