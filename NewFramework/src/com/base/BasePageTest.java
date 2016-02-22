package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BasePageTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver = new FirefoxDriver();
	}
    
	/*@AfterSuite
	public void quit()
	{
		driver.quit();
	}*/
}
