package day10;

public class Calc1 {

	public int num1;
	public int num2;
	public int result;
	
	public int add() {
		
		return num1+num2;
	}
	
	public void sub() {
		
		result = num1 - num2;
		System.out.println("Sub value: " +result);
	}
	
	public void mul() {
			
			result = num1 * num2;
			System.out.println("Mul value: " +result);
		}
	
	public void div() {
		
		result = num1 / num2;
		System.out.println("Div value: " +result);
	}
}
