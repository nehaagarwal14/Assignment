package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.main.FactorialRecursion;

public class FactorialRecursionTest {
	
	@Test
	public void metod1(){		
		int num = 6;
		FactorialRecursion fr = new FactorialRecursion();
		int expected = 720;
		int actual = fr.recur(num);
		assertEquals(expected,actual);
		
	}

}
