package exercises;

import java.util.Scanner;

public class Sum4 {
	
	public static void main(String[] args) {  
	      Scanner readInput = new Scanner(System.in);  
	      System.out.print("First Number: ");  
	      float a = readInput.nextFloat();  
	      System.out.print("Second Number: ");  
	        float b = readInput.nextFloat();  
	        readInput.close();  
	        // It will return the sum of a and b.  
	        System.out.print("The sum of a and b is = " + Float.sum(a, b));  
	    }  

}
