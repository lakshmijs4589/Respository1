package exceptionhandling;

public class ThrowkeywordExample {

	public static void main(String[] args) {
		int age = 15;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not Eligible");
		}

	}

}
