package singleinheritance;

public class ChildclassSingleInheritance extends ParentclassSingleInheritance{
	
	public void methodTwo()
	{
		System.out.println("age");
	}
	public static void main (String[]args)
	
	{
		ChildclassSingleInheritance o = new ChildclassSingleInheritance();
		o.methodone();
		o.methodTwo();
	}

}
