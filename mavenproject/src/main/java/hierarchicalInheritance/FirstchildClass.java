package hierarchicalInheritance;

public class FirstchildClass extends ParentClass{
	
	public void methodTwo()
	{
	 System.out.println("Diya");
	}

	public static void main(String[] args) {
		FirstchildClass obj = new FirstchildClass();
		obj.methodone();
		obj.methodTwo();
	}
		

	}

