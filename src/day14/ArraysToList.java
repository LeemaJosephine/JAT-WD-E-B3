package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"Apple","Orange","Banana","Grapes"};
		
		System.out.println("Using Arrays.asList()");
		
		List<String> asList = Arrays.asList(arr);
		
		System.out.println(asList);
		
		
		System.out.println("Using collection.addAll() ");
		
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, arr);
		
		System.out.println(list);
		
		System.out.println("Converting List to Array ");
		
		String[] array = list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(array));
	}

}
