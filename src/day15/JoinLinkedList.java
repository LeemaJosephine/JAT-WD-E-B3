package day15;

import java.util.LinkedList;

public class JoinLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		LinkedList<Character> list2 = new LinkedList<Character>();
		
		list2.add('A');
		list2.add('B');
		list2.add('C');
		list2.add('D');
		
		LinkedList<Object> list3 = new LinkedList<Object>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println(list3);
	}

}
