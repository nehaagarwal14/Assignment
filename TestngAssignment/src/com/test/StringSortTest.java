package com.test;

import org.testng.annotations.Optional;
//import org.testng.annotations.Optional;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import com.main.StringSort;

public class StringSortTest {
	@Test
	public void method(){
		String str = "neha";
		StringSort sr = new StringSort();
		String actual= sr.Sort(str);
		assertEquals("aehn",actual);
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void method1(){
		String str = null;
		StringSort sr = new StringSort();
		String actual = sr.Sort(str);
		assertEquals("null",actual);	
	}	
	
	@Test(testName = "stringInput")
	@Parameters({"stringInput"})
	public void method2(@Optional("bharti")String name){
		StringSort sr = new StringSort();
		String actual = sr.Sort(name);
		assertEquals("abhirt", actual);
	
	}
	
	@DataProvider(name = "data")
	public static Object[][]getdata(){
		Object[][]arr= {{"bharti","abhirt"}};
			return arr;
	}
	
	@Test(dataProvider = "data")
	public void method3(String input,String expected){
		StringSort sr = new StringSort();
		String actual = sr.Sort(input);
		assertEquals(expected, actual);
		
	}

}
