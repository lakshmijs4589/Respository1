package mulitipleinheritance;

public class MultipleChildclass implements MultipleParentone,Multipleparenttwo{
	public void methodone()
	{
		System.out.println("Lakshmi");
	}
	public void methodtwo()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		MultipleChildclass obj = new MultipleChildclass();
		obj.methodone();
		obj.methodtwo();

	}

}
