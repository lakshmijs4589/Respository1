package aggregation;

public class AggregationClass2 {
	
	int c;
	String d;
	
	AggregationClass1 e;     //Aggregation
	
	public AggregationClass2(int c, String d, AggregationClass1 e)
	{
		this.c=c;
		this.d=d;
		this.e=e;
	}
	public void methodtwo()
	{
		System.out.println(c +" "+d);
		e.methodone();
	}
	public static void main(String[] args) {
		AggregationClass1 obj = new AggregationClass1 (5,"Lakshmi");
		AggregationClass2 obj1 =new AggregationClass2(7,"Hello",obj); 
		obj1.methodtwo();
		

	}

}
