package day14;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Arun");
		names.add("Divya");
		names.add("Traun");
		names.add("Karthik");
		names.add("Traun");
		names.add("Karthik");
		
		System.out.println("Using for each:");
		
		for(Object name : names) {
			
			System.out.println(name);
		}
		
		
		names.remove("Arun");
		
		System.out.println(names);
		
		names.remove(1);
		
		System.out.println(names);
		
		names.removeFirst();
		names.removeLast();
		
		System.out.println(names);
		
	}

}
