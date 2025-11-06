package hierarchicalInheritance;

public class SecondchildClass extends ParentClass{
	
	public void methodthree()
	{
		System.out.println("DiyaTwo");
	}

	public static void main(String[] args) {
		SecondchildClass obj = new SecondchildClass();
		obj.methodone();
		obj.methodthree();

	}

}
