package superKeyword;

public class ChildA extends ParentA{
	int x = 50;
	public void methodone()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	public static void main(String[] args) 
	{
		ChildA obj = new ChildA();
		obj.methodone();
		
	}

}
