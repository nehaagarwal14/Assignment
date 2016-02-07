package com.main;

public class FactorialRecursion {	

	public int recur(int num){
		if (num==0) {
			return 1;
		}

		else return num * recur(num-1);		

	}

	}


