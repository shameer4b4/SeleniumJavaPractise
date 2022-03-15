package com.TestNG.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData {

	Properties prop;

	public ConfigData() {
		File src=new File("./Config/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("unable to read Config file"+e.getMessage());
		} 
		
	}
	public String GetChromeBrowser()
	{
		
		return prop.getProperty("ChromeBrowser");
	}
	public String GetFireFoxBrowser()
	{
		
		return prop.getProperty("FireFoxBrowser");
	}

	public String GetURL()
	{
		
		return prop.getProperty("URL");
	}


}
