package Others;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import Utils.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Screenshots_sample {

	public static void main(String[] args) throws IOException {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sehka\\eclipse-workspace\\Training_Cucumber\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		BaseClass.getscreenshot(driver, "method_img.png");
		
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File File = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(File, new File("./Screenshot/Img1.png"));
		
		String base = tk.getScreenshotAs(OutputType.BASE64);
		byte[] brr = Base64.getDecoder().decode(base);
		FileOutputStream fos = new FileOutputStream(new File("./screenshot/img2.jpeg"));
		fos.write(brr);
		

		 
		byte[] brr1 =tk.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos1 = new FileOutputStream(new File("./screenshot/img3.jpg"));
		fos1.write(brr1);
		fos1.close();
		
		
		driver.close();
		
	}
}
