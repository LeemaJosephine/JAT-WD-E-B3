package day11;

import day12.FinalKeyword;

public class EncapsulationExample{

	private String name;
	private int age;
	
	
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public void getName() {
		
		System.out.println("Name: "+name);
	}
	
	public void getAge() {
			
			System.out.println("Age: "+age);
		}
	
}
