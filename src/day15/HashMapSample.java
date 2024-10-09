package day15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("HashMap sample");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Tara");
		map.put(102, "Arun");
		map.put(103, "Raja");
		map.put(null, "Rani");
		map.put(104, null);
		map.put(106, null);
		map.put(105, null);
		map.put(105, "Leema");
		map.put(null, "Traun");
		
		System.out.println(map);
		
		// Get the size of the map
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(101));
		
		System.out.println(map.containsValue("Arun"));
		
		// To print the elements of HashMap
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for(Integer set : map.keySet()) {
			
			System.out.println(set);
		}
		
		System.out.println();
		
		System.out.println("HashTable sample");
		Hashtable<String, Double> table = new Hashtable<String, Double>();
		table.put("Maths", 89.1);
		table.put("English", 90.2);
		table.put("Tamil", 95.5);
		//table.put(null, null);
		
		
		System.out.println(table);
		
		System.out.println();
		
		System.out.println("LinkedHashMap sample");
		
		LinkedHashMap<String, Integer> link = new LinkedHashMap<String, Integer>();
		
		link.put("notebook", 20);
		link.put("pen", 10);
		link.put(null, null);
		link.put("pen", 20);
		link.put("bottle", null);
		link.put(null, 30);
		
		System.out.println(link);
		
		System.out.println();
		
		System.out.println("Tree Map sample");
		
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		
		tree.put("notebook", 20);
		tree.put("pen", 10);
		tree.put("bag", null);
		tree.put("bottle", null);
		tree.put("box", 30);
		
		System.out.println(tree);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
