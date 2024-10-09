package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating array list
		ArrayList<Object> names = new ArrayList<Object>();
		
		// Added the elements
		
		names.add("Arun");
		names.add("Divya");
		names.add("Traun");
		names.add("Karthik");
		names.add(1);
		names.add(1);
		
		System.out.println("Direct print");
		
		System.out.println(names);
		
		System.out.println("Using for each:");
		
		for(Object name : names) {
			
			System.out.println(name);
		}
		
		System.out.println("Using for loop");
		
		for(int i =0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		}
		
		System.out.println("Using Iterator");
		
		Iterator<Object> itr = names.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		// access the element
		
		System.out.println("Get and Set method");
		
		System.out.println("Before : " + names.get(1));
		
		names.set(1, "Tara");
		
		System.out.println("After: " +names.get(1));
		
		// sorting
		
		System.out.println("Sorting");
		
		System.out.println("Before sorting: " +names);
		
		//Collections.sort(names);
		
		System.out.println("After sorting: " +names);
		
	}

}
