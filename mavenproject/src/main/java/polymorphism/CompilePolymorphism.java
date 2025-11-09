package polymorphism;

public class CompilePolymorphism {
	
	public void methodone()
	{
		System.out.println("Lakshmi");
	}
	public void methodone(int a ,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void methodone(String f)
	{
		System.out.println(f);
	}

	public static void main(String[] args) {
		CompilePolymorphism obj = new CompilePolymorphism();
		obj.methodone();
		obj.methodone(2 ,3);
		obj.methodone("Hello");


	}

}
