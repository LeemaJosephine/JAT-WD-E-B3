package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream file = new FileOutputStream("D:\\NewWorkSpace\\JavaProblems\\src\\day1\\sample.txt");
			file.write(10);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Check the file path");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
