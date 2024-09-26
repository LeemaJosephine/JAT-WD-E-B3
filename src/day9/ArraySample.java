package day9;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("Enter the string");
		String a = sc.next();
		System.out.println(a);
		

		
		
		int[] arr = new int[size];

		for(int i =0; i< arr.length; i++)
			
			arr[i]= sc.nextInt();
		
		System.out.println();
		
		for(int num : arr) {
			
			System.out.println(num);
		}
	}

}
