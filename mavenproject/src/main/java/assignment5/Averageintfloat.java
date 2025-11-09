package assignment5;

public class Averageintfloat {
	
	public static void averagenum(int num1, int num2, int num3)
	{
		
		float averageint = (num1+num2+num3)/3;
		System.out.println("The average of integer :" + averageint );
		
	}
	public static void averagenum(float a,float b,float c)
	{
		float averagefloat = (a+b+c)/3;
		System.out.println("The average of float :" + averagefloat);
	}
	

	public static void main(String[] args) {
		averagenum(4,9,6);
		averagenum(2.3f,3.5f,5.6f);
		
	}

}
