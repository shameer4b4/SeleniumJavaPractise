package com.TestNG.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPage {
	
	public WebDriver driver;

	public MyInfoPage(WebDriver ldriver) {
		
		this.driver=ldriver;		
	}
	
	@FindBy(xpath = "//b[text()='My Info']") WebElement MyInfoBTN;
	
	
	public void ClickMyInfoBTN()
	{
		MyInfoBTN.click();
	}

}
