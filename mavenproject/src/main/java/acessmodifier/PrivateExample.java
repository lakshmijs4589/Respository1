package acessmodifier;

public class PrivateExample {
	private void methodone()
	{
		System.out.println("Lakshmi");
	}
	
	public static void main(String[] args) {
		PrivateExample obj = new PrivateExample();
			obj.methodone();
	}

}
