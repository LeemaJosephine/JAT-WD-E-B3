package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsExample {

	
	public void fileHandle() throws FileNotFoundException {
		
		FileOutputStream file = new FileOutputStream("D:\\NewWorkSpace\\JavaProblems\\src\\day1\\sample.txt");

	}
	
	public void file() throws FileNotFoundException {
		
		fileHandle();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample obj  = new ThrowsExample();
		try {
			obj.file();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
