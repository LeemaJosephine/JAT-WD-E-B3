package day12;

public class ConcretteClass extends InterfaceImplementation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcretteClass obj = new ConcretteClass();
		obj.print();
		System.out.println(obj.printReturn());
		obj.add();
		
	}

	@Override
	public int printReturn() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

}
