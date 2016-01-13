package Assignment2;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int n,i,j,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements of array");
		n= s.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for (i=0; i< arr.length; i++){
			arr[i] = s.nextInt();
		}
		
		for (i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if (arr[i]>arr[j]){
					
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]= temp;							
				}
			}
		}
        System.out.println("sorted array");
        for(i=0; i<n;i ++){
        System.out.print(arr[i]);
        }
        s.close();
	}

}
