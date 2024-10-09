package day14;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> names = new Vector<String>();
		names.add("Arun");
		names.add("Divya");
		names.add("Traun");
		names.add("Karthik");
		
		System.out.println(names.size());
		
		names.remove(0);
		
		System.out.println("Using for each:");
		
		for(Object name : names) {
			
			System.out.println(name);
		}
		
		System.out.println(names.get(2));
	}

}
