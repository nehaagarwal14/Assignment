package com.util;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public String URL;
	public String Browser;
	
	 public Configuration()
	{
		readProps();
	}
	
	public void readProps()
	{
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("config.properties");
			p.load(reader);
			URL = p.getProperty("url");
			Browser = p.getProperty("browser");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
