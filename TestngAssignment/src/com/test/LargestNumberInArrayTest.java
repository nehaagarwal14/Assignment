package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.LargestNumberInArray;

public class LargestNumberInArrayTest {
	
	@Test
	public void method1(){
		int []arr = {67,46,34,5};
        LargestNumberInArray larg = new LargestNumberInArray();
        int expected = 67;
        int actual= larg.lagestNum(arr);
        assertEquals(expected,actual);      
      }

	@Test
	public void method2(){
		int []arr = {-1,-2,-3,-4,-5};
        LargestNumberInArray larg = new LargestNumberInArray();
        int expected = -1;
        int actual= larg.lagestNum(arr);
        assertEquals(expected,actual);      
      }
	
}
