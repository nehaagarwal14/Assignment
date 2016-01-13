package Assignment2;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		int n,sum=0,expectedsum,missingno;

		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elemnts in array");
		n =in.nextInt();

		int[] a = new int[n];
		System.out.println("enter the elements of array in sorted order");
		for(int i=0;i<a.length;i++){
			a[i]= in.nextInt();
		}

		for(int i =0; i<a.length; i++){  
			sum = a[i]+sum;				 
		}
		System.out.println("sum of entered elements of array ="  +sum);	

		expectedsum= (n+1)*(n+2)/2;
		System.out.println("expected sum of  n elements of array =" + expectedsum);

		missingno = (expectedsum-sum);

		System.out.println("missing element of array =" + missingno);
		in.close();








	}

}
