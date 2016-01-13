package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CommonNumber {

	public static void main(String[] args) {
// one method
		/*	int[] arr1 = {3,7,9,42};
		    int[] arr2 = {4,3,34,5,7};

		    for (int i=0; i<arr1.length; i++){
		    for(int j=0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]){
					System.out.println("common element is" + arr1[i]);
				}

			}
		}
		 */
// second method		
		int n1,n2;

		Scanner a = new Scanner(System.in);
		System.out.println("enter the number of elements in array1");
		n1 = a.nextInt();		

		int[] arr1 = new int[n1];
		System.out.println("enter elements of array1");
		for(int i =0; i< arr1.length; i++){
			arr1[i] = a.nextInt();}
	    Arrays.sort(arr1);	    
		System.out.println(Arrays.toString(arr1));
		
		Scanner b = new Scanner(System .in);
		System.out.println("enter the number of elements in array2");
		n2 = b.nextInt();			

		int[] arr2 = new int[n2];
		System.out.println("enter elements of array2");
		for(int j =0; j< arr2.length; j++){
		   arr2[j] = b.nextInt();}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		for(int i =0; i<arr1.length; i++){
			for (int j=0; j<arr2.length; j++){
				if( arr1[i]== arr2[j]){
					System.out.println("matching number is" + arr1[i]);
					break;
				}
				}
		}

a.close();
b.close();
			



		}

	}
