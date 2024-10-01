package day11;

public class Calc2 extends Calc1 {

	@Override
	public void add() {
		
		result = num1 + num2 + 1;
		System.out.println("Addition with + 1 " + result);
	}
	public void mod() {
		
		result = num1 % num2;
		System.out.println("Mod value "+result);
	}
}
