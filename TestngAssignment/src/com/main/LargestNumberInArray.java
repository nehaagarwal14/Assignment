package com.main;

public class LargestNumberInArray {
	
	public  int lagestNum(int[] arr) {	
		
        int max = arr[0];
	 
	    for(int i = 1; i<arr.length; i++) {
		 
		      if (arr[i] > max){
			  max= arr[i];
		      }		 	 
	    }
		return max;
	}
}
