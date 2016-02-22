package com.page;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(PageDriver driver)
	{
		super(driver);
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		
	}
	
	
	
	public String clickLogin(){		
		
		driver.findElement(By.id("loginButton")).click();
		String url = driver.getCurrentUrl();
		return url;		
	}
	
	public String performLogin(String uname,String pwd)
	{
		String error =null;
		driver.maximize();
		driver.waitin();
		//driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.cssSelector("#username")).sendKeys(uname);
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).sendKeys(uname);
		//driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).sendKeys(pwd);
		//driver.findElement(By.cssSelector("#login")).click();
		driver.findElement(By.cssSelector(Locators.loc.get("login-submit-button"))).click();
		//driver.findElement(By.cssSelector("#login")).click();
		driver.findElement(By.cssSelector("login-error")).getText();
		
		
		return error;
	}

}
