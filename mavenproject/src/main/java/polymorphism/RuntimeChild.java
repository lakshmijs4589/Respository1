package polymorphism;

public class RuntimeChild extends RuntimeParent{
	public void methodone()
	{
		super.methodone();
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		//First Type
		RuntimeChild obj = new RuntimeChild();
		obj.methodone();
		
		//SecondType
		RuntimeParent obj1 = new RuntimeChild();
		obj1.methodone();

	}

}
