package com.main;

public class StringSort {
	public String Sort(String str){
		
		char[] arr = str.toCharArray();		
		
		for(int i =0;i<arr.length; i++){
			for (int j =i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	}						
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		str = String.valueOf(arr);
		System.out.println( str );
		return  str;
		
	}

}
