package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;
import com.page.LoginPage;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass()
	public void initialize()
	{
		hp = new HomePage(driver);		
		hp.clickLogin();
		driver.waitin();
		lp = new LoginPage(driver);
		String actual =lp.clickLogin();
		assertEquals("http://whiteboxqa.com/login.php",actual);
	}

	@DataProvider(name= "user-data")
	public Object[][] getUserData()
	{
		Object[][] data = {{"neha","neha"},{"parnika","parnika"}};	
		return data;
	}
	
	@Test(dataProvider = "user-data")
	public void testInvalidLogin(String userName,String pwd)
	{
		String actual = lp.performLogin(userName, pwd);
		assertEquals("Something went wrong...Please try again",actual);
	}
}
