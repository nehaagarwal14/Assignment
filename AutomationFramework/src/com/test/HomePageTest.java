package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest {

	HomePage hp;

	@BeforeClass
	public void initialize()
	{
		hp = new HomePage(driver);
		
	}

	@Test
	public void testcountsocialIcons()
	{
		driver.maximize();
		int actual = hp.countSocialIcons();
		assertEquals(1, actual);
	}
	
	

	@Test
	public void testLoginClick()
	{
		driver.maximize();
		driver.waitin();
		String actual = hp.clickLogin();
		assertEquals("http://whiteboxqa.com/login.php",actual);
	}

	 @AfterClass
		public void quit()
		{
			driver.quit();
		}
}
