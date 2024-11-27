package Others;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handles {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\sehka\\eclipse-workspace\\Training_Cucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindow = driver.getWindowHandle();
		
		System.out.println("parent window - " + parentwindow);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String windows : windowhandles) {
			System.out.println(windows);  
			if(!windows.equals(parentwindow)) 
			{
			driver.switchTo().window(windows);
			driver.findElement(By.id("firstName")).sendKeys("Sekar");
			Thread.sleep(3000);
			driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("panneerselvam");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
