package com.TestNG.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BrowserFactory 
{
	public static WebDriver StartBrowser(WebDriver driver, String browserName, String URL)
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();			
		}
		else if (browserName.equalsIgnoreCase("fireFox")) 
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe"); 
			driver=new FirefoxDriver();				
		}		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}
	@BeforeSuite
	public static void launch(WebDriver driver) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://google.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
		
	}
	
	@AfterSuite
	public static void closeBrowser(WebDriver driver)
	{		
		driver.close();
		driver.quit();
	}
//	@AfterMethod
//	public void onTestFailure(ITestResult result)
//	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			publicLibrary.Screenshot(driver);
//		}
//	}
	

	

}
