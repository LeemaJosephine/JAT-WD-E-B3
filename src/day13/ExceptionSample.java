package day13;

import java.util.Scanner;

public class ExceptionSample {

	int a;
	int b;
	int c;

	int[] arr = new int[5];
	
	String str = null;
	
	public void div() {
		
		try {
			
		System.out.println(str.length());
		
		} catch (Exception e) {
			
			System.out.println("Exception occured, please check");
		}
		
		try {
			
			c= a/b;
		}
		catch(ArithmeticException e) {
			
			c = a / 1;
			System.out.println("Please enter a value that is not 0");
			e.printStackTrace();
			
		} 
		
		try{
			
			arr[5]=c;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			arr[1]=c;
			System.out.println(arr[1]);
			System.out.println("Index is beyond the limit so adding in first position");
			
		} 
		
		System.out.println("The div value of a and b " +c);
	}
	
	public static void main (String[] args) {
		
		ExceptionSample obj = new ExceptionSample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		obj.a=sc.nextInt();
		System.out.println("Enter the value for b: ");
		obj.b=sc.nextInt();
		obj.div();
	}
	
}
