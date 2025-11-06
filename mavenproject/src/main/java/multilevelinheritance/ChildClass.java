package multilevelinheritance;

public class ChildClass extends IntermediateClass{
	
	public void methodthree()
	{
		System.out.println("Age");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.methodone();
		obj.methodtwo();
		obj.methodthree();
		

	}

}
