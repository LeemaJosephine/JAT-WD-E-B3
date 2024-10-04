package oopsProblems;

public class Dog {

	
	private String name;
	private String bread;
	
	public Dog(String name, String bread) {
		
		this.name = name;
		this.bread = bread;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getBread() {
		
		return bread;
	}
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setBread(String bread) {
		
		this.bread = bread;
	}
	
	public static void main(String[] args) {
		
		Dog obj = new Dog("Buddy", "Bulldog");
		
		// print the intial values
		System.out.println("Name: " +obj.name);
		System.out.println("Bread: " +obj.bread);
		
		// update the values
		
		obj.setName("Tommy");
		obj.setBread("Pug");
		
		// print the modified values
		System.out.println("Modified values: ");
		System.out.println("Name: " +obj.name);
		System.out.println("Bread: " +obj.bread);
		
		
	}
	
}
