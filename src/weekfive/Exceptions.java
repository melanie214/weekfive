package weekfive;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		System.out.println("hi");
		
		if (numbers.length > 3)
		System.out.println(numbers[3]);
		
	
		System.out.println("Bye!");
		
		
		
		/*
		 * Checked Exception- explicitly check for in our code. 
		 * try catch block- handles checked exceptions
		 * 
		 * unchecked Exception- we can avoid them by writing clean code. programmer errors. something we have control over
		 */
	
		try {
			
		FileReader fileReader = new FileReader("something.txt"); 
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			
		} finally {
			System.out.println("Finally!");
		}
		
		System.out.println("after the try catch");
		
		
		
	}
	
	}
	


