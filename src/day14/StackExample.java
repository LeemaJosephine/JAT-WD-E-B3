package day14;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<String> stk = new Stack<String>();
		
		// to add
		
		stk.push("Apple");
		stk.push("Orange");
		stk.push("Banana");
		stk.push("Grapes");
		
		System.out.println("Stack: " +stk);
		
		stk.pop();  // remove the last
		
		System.out.println(stk);
		
		System.out.println(stk.peek());  // retrive the element
		
		int location = stk.search("Orange");
		System.out.println(location);
		
	}

}
