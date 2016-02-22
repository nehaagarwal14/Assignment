package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	    driver.get("http://whiteboxqa.com/login.php");
	}
	
	public String performLogin(String uName ,String pwd)
	{    
		String url = null;
		driver.findElement(By.cssSelector("#username")).sendKeys(uName);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login")).click();
		url = driver.getCurrentUrl();		
		return url;
	}
	
	

}
