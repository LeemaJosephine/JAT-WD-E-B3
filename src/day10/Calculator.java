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
	
	public static  void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		
		Calculator obj1 = new Calculator();  // default constructor
		Calculator obj = new Calculator(value1,value2); // parameterized con
		
		
		
		
		// Reading the value from console and storing in the variable
//		System.out.println("Enter the value for num1: ");
//		obj.num1= sc.nextInt();
//		
//		System.out.println("Enter the value for num2: ");
//		obj.num2 = sc.nextInt();
		
		obj.add();  // calling/ invoking the methods
		
		obj.result = obj.sub();
		System.out.println("The sub value is " +obj.result);
		
		// To call static variable and method by using class name
		
		Calculator.num3= 40;
		Calculator.num4=10;
		
		Calculator.mul();
		
		// For division operation
		
		obj.div(obj.num1,obj.num2);
		
		
		
	}

}
