package com.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver {
	
	WebDriver driver;
	Configuration configuration;
	
	public PageDriver(Configuration config){
		this.configuration = config;
		initializeBrowser();
		//driver  = new FirefoxDriver();		
	}
	
	public void initializeBrowser()
	{
		String browser = configuration.Browser;
		
		switch (browser)
		{
		case "firefox":
			 startFirefox();
			  break;
		case "chrome":
		     startChrome();
		      break;
		case "ie":
			 startIE();
			  break;
		default:
		     startHTML();
		      break;		
		}
	driver.get(configuration.URL);
	}
	
	public void startFirefox()
	{
		this.driver = new FirefoxDriver();
	}
		
	public void startChrome()
	{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		this.driver = new ChromeDriver();
	}
	
	public void startIE()
	{
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		this.driver = new InternetExplorerDriver();
	}
	public void startHTML()
	{
		this.driver = new HtmlUnitDriver();
	}
	public void get ( String url)
	{
		driver.get(url);
	}
	public WebElement findElement(By by)
	{
		return driver.findElement(by);
	}
	
	public List<WebElement> findElements(By by)
	{
		return driver.findElements(by);
	}
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
		
		
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public void waitin()
	{
		driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.MILLISECONDS);
	}
	
	public void performLogin(By by)
	{
		driver.findElement(by);
	}

	public void quit() {
		driver.quit();		
	}
	

}
