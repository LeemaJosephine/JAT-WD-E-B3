package day10;

import java.util.Scanner;

public class Calculator {
	
	
	// Variables
	
	int num1;
	int num2;
	int result;
	
	static int num3;
	static int num4;
	static int res;
	
	// methods
	
	public Calculator() {
		
		System.out.println("Default constructor");
	}
	public Calculator(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		
		result = num1 + num2;
		System.out.println("Addition valus is : " +result);
		
	}
	
	public int sub() {
		
		result = num1 - num2;
		return result;
		
	}
	
	public static void mul() {
		
		res = num3 * num4;
		System.out.println("The value for multiplication is "+ res);
		
	}
	
	public void div(int num1, int num2) {
		 
		this.num1 = num1;
		this.num2 = num2;
		
		result = num1 / num2;
		
		System.out.println("The value for division " + result);
		
	}
	
}
