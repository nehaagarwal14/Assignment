package Assignment;

import java.util.Scanner;

public class InputFromCommand {

	public static void main( String[] args) {
	
		int x;	
		
		String s;
		
		Scanner in = new Scanner ( System.in);
		
		System.out.println("enter  an integer");
		x = in.nextInt();		
		System.out.println("you entered an integer " +x);
		
		System.out.println("enter a String");
		s = in.next();
		System.out.println("you enetered a String "  +s );
		in.close();
		
		
		
		
		

	}

}
