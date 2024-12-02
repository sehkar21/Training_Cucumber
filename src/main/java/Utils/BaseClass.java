package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
	

	
	public static void getscreenshot(WebDriver driver, String filename) throws IOException
	{
        TakesScreenshot tk = (TakesScreenshot) driver;
		File File = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(File, new File("./screenshots/"+filename+""));
	}
	
	public static void getbrowser() throws InterruptedException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\resources\\properties\\global.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("qaurl");
	    
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		//System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"CucumberAutomation\\Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			BaseClass.driver = new ChromeDriver();
			BaseClass.driver.get(url);	
			BaseClass.driver.manage().window().maximize();
			BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
		//System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"CucumberAutomation\\Driver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			
			BaseClass.driver = new FirefoxDriver();
			BaseClass.driver.get(url);	
			BaseClass.driver.manage().window().maximize();
			BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);		
		} 
	}
}
