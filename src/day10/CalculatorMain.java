package day10;

import java.util.Scanner;

public class CalculatorMain {

public static  void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		
		
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
