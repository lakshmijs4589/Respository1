package abstraction;

public class AbstractionChild extends AbstractionParent{
	

	public static void main(String[] args) {
		AbstractionParent obj = new AbstractionChild();
		obj.methodone();
		obj.methodtwo();
	}
	public void methodtwo()
	{
		System.out.println("Lakshmi");
	}
	

}
