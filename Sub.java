package classtest3;

public class Sub extends Base {
	
	public void method(int j)
	{
		System.out.println("The value is " +j);
	}
	
	public void method(String s)
	{
		System.out.println("I was passed " +s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b1 = new Base();
		Base b2 = new Sub();
		b1.method(5);
		b2.method(6);

	}

}
/*Value is 5
The value is 6*/

