package com.TestNG.Pages;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.TestNG.Utilities.BrowserFactory;
import com.TestNG.Utilities.ConfigData;
import com.TestNG.Utilities.ExcelData;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import commonLibraries.publicLibrary;


public class BaseClass {

	public WebDriver driver;
	public ExcelData excel;
	public ConfigData configdata;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel=new ExcelData();
		configdata=new ConfigData();
		htmlreporter= new ExtentHtmlReporter("./reports/"+publicLibrary.getTimeStamp()+".html");
		report= new ExtentReports();
		report.attachReporter(htmlreporter);
		Reporter.log("Test Suite started successfully");
	}	
	
	@BeforeClass
	public void setUp()
	{
		
		driver=BrowserFactory.StartBrowser(driver, configdata.GetChromeBrowser(), configdata.GetURL());
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("Screenshot captured successfully");
			publicLibrary.Screenshot(driver);
		}
		report.flush();
	}

}
