package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(25);
		a.add(35);
		a.add(55);
		a.add(24);
		
	System.out.println(a);
	
	Iterator<Integer> l = a.iterator();
	
	while(l.hasNext())
	{
		System.out.println(l.next());
		
	}
		l.remove();
		System.out.println(a);
		
		
	}

}
