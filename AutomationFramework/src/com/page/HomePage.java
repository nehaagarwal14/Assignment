package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	public HomePage(PageDriver driver){
		super(driver);	
		
	}
	
	/*public void openPage(){
		driver.get("http:// whiteboxqa.com");
	}*/

	public int countSocialIcons(){	
		
		int count = 0;
		//List<WebElement> elements = driver.findElements(By.cssSelector(".pull-right.social-icons"));
		List<WebElement> elements = driver.findElements(By.cssSelector(Locators.loc.get("header-social-icons")));
		if( !elements.isEmpty())
		{
			count= elements.size();
		}
		return count;		
	}
	
	public String clickLogin(){		
	    String url = null;
	    driver.maximize();
	    driver.waitin();
	   // driver.findElement(By.cssSelector("#loginButton")).click();
	    driver.findElement(By.cssSelector(Locators.loc.get("header-login-link"))).click();
	   // driver.findElement(By.cssSelector(Locators.loc.get("header-login-link"))).click();
		//driver.findElement(By.id("loginButton")).click();
		url = driver.getCurrentUrl();
		return url;		
	}
}
