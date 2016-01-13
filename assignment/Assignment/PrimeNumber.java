package Assignment;

import java.util.Scanner;

public class PrimeNumber {
     	
	

	public static void main(String[] args) {
		
		
		int temp;
		boolean isprime= true;
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Enter any number");
		
		int num = scan.nextInt();
		 for (int i =2;i<=num/2; i++) {
			 temp = num % i ;
			 
		     if (temp == 0){ 
	         isprime = false;			
		     }
		     
		     
		 }
		 if (isprime) {
			 System.out.println(num + " is prime");
		 }
		 else {
			 System.out.println( num + " is not prime");
		 }
		 scan.close();
	}

}
