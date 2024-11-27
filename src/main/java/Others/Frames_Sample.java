package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Frames_Sample {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sehka\\eclipse-workspace\\Training_Cucumber\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	driver.findElement(By.id("name")).sendKeys("sekar");
	
	driver.switchTo().frame(driver.findElement(By.id("frm3")));
	
	driver.findElement(By.id("name")).sendKeys("csk");
	
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
	Select s = new Select(driver.findElement(By.id("course")));
	s.selectByValue("java");
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame(driver.findElement(By.id("frm2")));
	
	driver.findElement(By.id("firstName")).sendKeys("cskadadaf");
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	Select s1 = new Select(driver.findElement(By.id("selectnav1")));
	s1.selectByIndex(3);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).sendKeys("wqwe");
	
			//driver.close();
	
	
}	
	
	
	
}
