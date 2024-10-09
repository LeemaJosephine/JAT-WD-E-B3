package day15;

import java.util.LinkedHashSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Guvi Geek";
		
		char[] arr = str.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(char ch : arr) {
			
			set.add(ch);
		}
		
		String str1 = "Welcome Welcome to the class today today";
		String[] split = str1.split(" ");
		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		for(String str2 : split) {
			
			set1.add(str2);
		}
		
		System.out.println(set1);
		
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		SortedMap<Integer, String> map2 = new TreeMap<Integer, String>();
		
		
		map1.put(10, "Red");
		map1.put(20, "Green");
		map1.put(30, "Black");
		map1.put(40, "White");
		map1.put(50, "Pink");
		
		map2 =  map1.subMap(20, 40);
		System.out.println(map2);
	}

}
