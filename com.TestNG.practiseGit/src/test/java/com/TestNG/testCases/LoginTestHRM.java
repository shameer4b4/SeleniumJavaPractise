package com.TestNG.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.TestNG.Pages.BaseClass;
import com.TestNG.Pages.loginPage;
import com.TestNG.Utilities.BrowserFactory;
import com.TestNG.Utilities.ExcelData;

public class LoginTestHRM extends BaseClass {

	@Test
	public void testApp() {

		logger = report.createTest("Loggin method of HRM Website");

		String username = excel.getStringData("loginHRM", 0, 0);

		String Password = excel.getStringData("loginHRM", 0, 1);

		loginPage login = PageFactory.initElements(driver, loginPage.class);

		login.loginCredentials(username, Password);

		logger.info("Application launched successfully");

		logger.pass("Application successfully");

	}

	@Test
	public void MyTimeSheet() {

		logger = report.createTest("MyTimeSheet testCase");

		DashBoard_myTimeSheet myTimeSheetPage = PageFactory.initElements(driver, DashBoard_myTimeSheet.class);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		myTimeSheetPage.ClickMyTimeSheet();

		logger.info("MyTimeSheet testCase launched successfully");

		logger.fail("MyTimeSheet test Case Failed");

		logger.pass("MyTimeSheet testCase successfully");
	}

	@Test
	public void MyInfoPage() {
		
		logger = report.createTest("MyInfoPage Test Case");

		MyInfoPage infopage = PageFactory.initElements(driver, MyInfoPage.class);
		
		infopage.ClickMyInfoBTN();
		
		logger.info("MyInfoPage testCase launched successfully");

		logger.fail("MyInfoPage test Case Failed");

		logger.pass("MyInfoPage testCase successfully");
	}

}
