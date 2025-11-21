package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) 
	{
		List<String> l = new LinkedList<String>();
		l.add("Lakshmi");
		l.add("Hello");
		l.add("Hi");
		l.add("Hello");
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(0,"Lachu");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(0);
		System.out.println(l);
		System.out.println(l.contains("Hi"));
		System.out.println(l.indexOf("Hi"));
		System.out.println(l.lastIndexOf("Hello"));
		
		
	}

}

