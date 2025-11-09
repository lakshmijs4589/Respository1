package superKeyword;

public class InvokeChildclass extends InvokeParent{
	
	public void test1()
	{
		super.test1();
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		InvokeChildclass obj = new InvokeChildclass();
		obj.test1();
		

	}

}
