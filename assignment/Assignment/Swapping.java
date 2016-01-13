package Assignment;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	int x, y;	 
	Scanner in = new Scanner(System.in);
	x = in.nextInt();
	y = in.nextInt();
	
	System.out.println("numbers before swapping x = "+x+ " \ny=" +y);
	x= x+y;
	y= x-y;
	x= x-y;
	
	System.out.println("numbers after swapping  x = "+x+" \ny= " +y);
	in.close();

	}

}
