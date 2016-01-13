package Assignment;

import java.util.Scanner;

public class PingPong {
	public static void main(String[] args) {
		
		int x;
		
		Scanner in = new Scanner (System.in);		
		x = in.nextInt();
	
		
		if (x % 3 ==0 && x%5==0) {
		    System.out.println( "ping pong");
		}
		else if (x % 3 == 0) {
			System.out.println("ping");
		}
		else if (x % 5 == 0){
			System.out.println("pong");
		}
		
		else {
			System.out.println("number is "  +x);
		}
		
		in.close();
	}

}
