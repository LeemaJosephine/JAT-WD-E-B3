package day11;

public class CalculatorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single Inheritance
		
		System.out.println("Single Inheritance");
		
//		Calc1 obj3 = new Calc1();
//		obj3.num1=10;
//		obj3.num2=20;
//		obj3.add(); // 10 + 20 
		
		Calc2 obj = new Calc2();
		obj.num1=10;
		obj.num2=20;
		
		// Polymorphism 
		
		obj.add(10);  // 10 + 20 + 10
		obj.add();  // 10 + 20 + 1
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
		
		// Muti-level Inheritance
		
		System.out.println("Multi-level Inheritance");
		
		Calc3 obj1 = new Calc3();
		obj1.num1=20;
		obj1.num2=10;
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		obj1.mod();
		obj1.cos();
		obj1.tan();
		
		// Hierachy Inheritance
		
		System.out.println("Hierarchy Inheritance");
		
		Calc4 obj2 = new Calc4();
		obj2.num1=10;
		obj2.num2=10;
		obj2.add();
		obj2.sub();
		obj2.mul();
		obj2.div();
		obj2.percentage();
		
	}

}
