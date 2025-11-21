package collection;

import java.util.HashSet;
import java.util.Set;

public class GetmethodsExample {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		
		a.add(18);
		a.add(25);
		a.add(35);
		a.add(45);
		System.out.println(a);
		
		b.add(23);
		b.add(5);
		b.add(25);
	
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		System.out.println(b.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(25));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		a.remove(25);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		a.clear();
		System.out.println(a);
				
	}
	

}
