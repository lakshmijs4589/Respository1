package collection;

import java.util.HashSet;
import java.util.Set;

public class ForeachCollection {

	public static void main(String[] args) 
	{
		Set<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(25);
		a.add(35);
		a.add(45);
		for (Integer num : a)
		{
			System.out.println(num);
		}
		
	}

}
