package day9;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Print numbers from 1 to 10
		
		for(int i = 1; i <= 10 ; i++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		// print numbers from 10 to 1
		
		for(int i = 10; i >= 1 ; i--) {
			
			System.out.print(i+" ");
		}
		
		System.out.println("Patterm problem");
		int num =25;
		for(int row = 1; row <= 5 ; row++){
			for(int col=1 ; col<=5; col++){
				if(col == 7 ) {
					System.out.print(num);
				} else {
					System.out.print(num+" ");
				}
				num--;
			}
			System.out.println();
		}
		
		
		System.out.println("*****While loop******");
		
		int num1 = 1;
		
		while(num1<=10) {
			
			System.out.print(num1+ " ");
			num1++;
		}
		
		System.out.println();
		System.out.println("*****do-while loop******");
		
		int num2 =11;
		do {
			System.out.print(num2);
			num2++;
		} while (num2 <=10);
	
		
		System.out.println();
		// break and continue
		
		for(int i = 1; i <= 10 ; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.print(i+" ");
			
			
		}
	}

	
	
		
}
