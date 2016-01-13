package Assignment2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int n, i,search;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements of array");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of array");

		for (i = 0; i<arr.length; i++) {
			arr[i]= s.nextInt();
		}

		System.out.println("Enter the element for linear search");

		search = s.nextInt();

		for (i = 0; i<arr.length; i++) {
			if(arr[i] == search) {
				System.out.println(search  + " is present at" + " index " + (i));	
				break;
			}
		}
		if (arr.length==i) {
			System.out.println("number is not present");

		}
		s.close();	
	}

}