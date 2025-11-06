package multilevelinheritance;

public class IntermediateClass extends ParentClass{
	 public void methodtwo()
	 {
		 System.out.println("Diya");
	 }
	

	public static void main(String[] args) {
		IntermediateClass obj = new IntermediateClass();
				obj.methodone();
			obj.methodtwo();
		
	}

}
