package day12;

public interface Showable extends Printable{

	void show();
	
	default void sample() {
		
		System.out.println("Default method");
		
	}
	
	static void sample1() {
		
		System.out.println("Default method");
		
	}
}
