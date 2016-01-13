package Assignment2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int n,max;
		Scanner in = new Scanner(System.in);

		System.out.println("enter the number in array");

		n = in.nextInt();
		int[] a = new int[n];

		System.out.println("enter elements of array");

		for(int i=0; i< a.length; i++){				
			a[i] = in.nextInt();
		}

		max = a[0];
		for(int i=0; i<n;i++){
			if (max <a[i])
			{
				max = a[i];
			}
		}

		System.out.println("largest number is " +max);	
		in.close();


	}

}
