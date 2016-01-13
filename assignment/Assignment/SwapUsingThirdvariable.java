package Assignment;

import java.util.Scanner;

public class SwapUsingThirdvariable {
	
	public static void main(String[] args) {
		int x, y, temp;
		  
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println(" numbers before swap x =" +x+  "\ny= " +y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("numbers before swap x =" +x+  "\ny= " +y);
		in.close();
		
		
	}

}
