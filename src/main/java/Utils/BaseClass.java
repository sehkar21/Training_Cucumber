package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static void getscreenshot(WebDriver driver, String filename) throws IOException
	{
        TakesScreenshot tk = (TakesScreenshot) driver;
		File File = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(File, new File("./screenshots/"+filename+""));
	}
	
}
