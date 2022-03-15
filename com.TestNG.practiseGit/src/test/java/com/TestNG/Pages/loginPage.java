package com.TestNG.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver ldriver) 
	{
		this.driver=ldriver;		
		
	}
	
	@FindBy(name="txtUsername") WebElement uname;
	
	@FindBy(name="txtPassword") WebElement pass;
	
	@FindBy(name="Submit") WebElement Submit;
	
	public void loginCredentials(String Username, String Password)
	{
		uname.sendKeys(Username);
		pass.sendKeys(Password);
		Submit.click();
		System.out.println(System.getProperty("user.dir"));
		
		
	}


}
