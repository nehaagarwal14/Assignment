package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		driver.get("http://whiteboxqa.com/");
	}	
	
	
	public int countsocialIcons()
	{
		
		List<WebElement> elements=driver.findElements(By.xpath("html/body/header/div[1]/div/ul/li"));
	  
	    return elements.size();
	}
	   
	
	
	public String clickLogin()
	{
		String url = null;
		driver.findElement(By.cssSelector("#loginButton")).click();
		url= driver.getCurrentUrl();
		return url;
	}

}
