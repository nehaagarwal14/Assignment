package com.test;

import org.testng.annotations.Optional;
//import org.testng.annotations.Optional;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import com.main.StringSort;

public class StringSortTest {
	
	@Test(testName = "stringInput")
	@Parameters({"stringInput"})
	public void method1(@Optional("bharti")String name){
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
	public void method2(String input,String expected){
		StringSort sr = new StringSort();
		String actual = sr.Sort(input);
		assertEquals(expected, actual);
		
	}

}
