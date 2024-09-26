package day9;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// simple-if -> check eligible for vote -> condition age > 18 
		
		int age = 10;
		
		
		System.out.println("**********Eligible to vote program using simple if***********");
		
		if(age > 18) {
			
			System.out.println("Eligible to vote");
			
		}
		
		System.out.println("End of program");
		
		// if-else 
		
		System.out.println("**********Eligible to vote program using if-else***********");
		
		if(age > 18) {
			
			System.out.println("Eligible to vote");
		} else {
			
			System.out.println("Not Eligible to vote");
		}
		
		System.out.println("End of program");
		System.out.println();
		
		// if-else-if ladder
		
		System.out.println("**********if-else-if Ladder***********");
		
		// age should be 18 or 15
		
		if(age > 18) {
			
			System.out.println("Eligible to vote");
		} else if(age >= 15) {
			
			System.out.println("Can consider");
		} else if (age >=10 ){
			
			System.out.println("Sorry your age is below 15");
		} else {
			
			System.out.println("Sorry you can't vote");
		}
		
		System.out.println("End of program");
		
		
		System.out.println("**********Nested if***********");
		
		int num1 = 0;
		//int num2 = 15;
		
		if(num1 > 0) {
			if(num1 % 2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
		} else {
			
			System.out.println("Please enter a valid number");
		}
		
		
		System.out.println("**************Switch case*************");
		
		// Print the day name according to the day of week
		
		char dayOfWeek = 'a';
		int a=10;
		int b = 20;
		int c;
		String dayName;
		
		switch(dayOfWeek) {
		
		case 'a':
			dayName = "Monday";
			System.out.println("Case a got executed");
			c = a +b;
			System.out.println(c);
		break;
		
		case 'b':
			dayName="Tuesday";
		break;
		
		case 'c':
			dayName="Wednesday";
		break;
		
		default:
				dayName="Unknown";
			
		}
		System.out.println(dayName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
