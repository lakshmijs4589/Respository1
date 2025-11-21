package exceptionhandling;

public class Exceptionhandlingexample {

	public static void main(String[] args) {
		try 
		{
		int a = 100/0;
		System.out.println("a is" +a);
		}
		
		/*catch (ArithmeticException obj)
		{
			System.out.println(obj);
		}*/
		finally
		{
			System.out.println("Lakshmi");
		}
	}

}
