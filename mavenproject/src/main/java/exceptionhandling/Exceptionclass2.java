package exceptionhandling;

public class Exceptionclass2 {

	public static void main(String[] args) {
		try
		{
			int array[] = new int[5];
			array[5]=100/0; // having two exemption so two catch can be used
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
		System.out.println("Invalidcase");
		}
		catch (ArithmeticException b)
		{
		System.out.println("invalid"); // this one as output because Arithmetic is assigned in array[5]
		}
	}

}
