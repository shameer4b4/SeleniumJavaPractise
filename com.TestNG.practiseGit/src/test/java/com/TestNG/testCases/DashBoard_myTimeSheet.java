package com.TestNG.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_myTimeSheet {

	public WebDriver driver;

	public DashBoard_myTimeSheet(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//span[text()='Assign Leave']") WebElement MyTimeSheetMenu;
	
	@FindBy(xpath = "//b[text()='Directory']") WebElement Directory;
	
	//b[text()='Directory']
	
	public void ClickMyTimeSheet()
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//MyTimeSheetMenu.click();
		
		Directory.click();
	}

}
