package commonLibraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class publicLibrary {

	public static WebDriver driver;

	public publicLibrary() {

	}

	public static void Screenshot(WebDriver driver) 
	{
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date currentDate = new Date();
		String ScreenshotName = currentDate.toString().replace(" ", "-").replace(":", "-");
		try {
			org.openqa.selenium.io.FileHandler.copy(scr, new File("./Screenshots/" + ScreenshotName + ".png"));
		} catch (IOException e) {
			System.out.println("unable to take Screenshot" + e.getMessage());
		}

	}
	
	public static String getTimeStamp()
	{
		Date currentDate = new Date();
		String ScreenshotName = currentDate.toString().replace(" ", "-").replace(":", "-");
		
		return ScreenshotName;
		
	}


}
