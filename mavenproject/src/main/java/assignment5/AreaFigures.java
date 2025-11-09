package assignment5;

public class AreaFigures {
	
	public static void findarea(int r)
	{
		float circlearea = 3.14f *r*r;
		System.out.println("The area of a circle is " + circlearea);
	}
	public static void findarea(int l , int b)
	{
		float rectanglearea = l*b;
		System.out.println("The area of a rectangle is " + rectanglearea);
	}
	public static void findarea(double side)
	{
		float squarearea = (float) (side * side);
		System.out.println("The area of a square is " + squarearea);
	}

	public static void main(String[] args) {
		findarea(45);
		findarea(4,5);
		findarea(5.0);
		
		
	}

}
