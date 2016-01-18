package Assignment5;

import java.util.Scanner;

public class InputSeies {

	public static void main(String[] args) {
		/*int [] s = new int [] {1,3,5,2,4,6};
		System.out.println(s.length);

		int [] x = new int[s.length];
		for (int i =0, j=3, k =0; (i< 3 || j < 6) && k < 6; k++) {
			System.out.println("k = " + k);
			if (k%2 == 0) {
				x[k] = s[i];
				i++;
				System.out.println("i = " + i);
			} else {
				x[k] = s[j];
				j++;
				System.out.println("j = " + j);
			}
		}

		for (int i =0; i < 6; i++) {
			System.out.println(x[i]);
		}*/
		
	Scanner in = new Scanner(System.in);
	int n;
	System.out.println("Enter the number of elements in an arraylist");
	n = in.nextInt();
	
	String [] arr = new String[n];
	System.out.println("Enter the elements of array"); 
	for(int i =0; i<arr.length; i++){
		arr[i] = in.next();		
	}	
	String [] arr1 = new String[n];
	
	for(int i =0, j=n/2, k=0; (i<n/2 || j< n) && k<n ; k++){
		if(k%2 == 0){
			arr1[k] = arr[i];
			i++;
		}
		else{
			arr1[k] = arr[j];
			j++;
		}		
	}
	for( int k = 0; k<n; k++){
		System.out.println(arr1[k]);
	}
	
	in.close();
	
	}
	
	}
