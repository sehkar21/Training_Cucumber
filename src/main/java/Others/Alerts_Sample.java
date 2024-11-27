package Others;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts_Sample {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\sehka\\eclipse-workspace\\Training_Cucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		WebElement e1 = driver.findElement(By.id("alertBox"));
		e1.click();
		
		Alert SimpleAlert = driver.switchTo().alert();
		System.out.println(SimpleAlert.getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleAlert.accept();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement e2 = driver.findElement(By.id("confirmBox"));
		e2.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.getText();
		confirmAlert.accept();
		WebElement outputmsg = driver.findElement(By.id("output"));
		System.out.println(outputmsg.getText());
		
		WebElement e3 = driver.findElement(By.id("promptBox"));
		e3.click();
		
		Alert PromptAlert = driver.switchTo().alert();
		System.out.println(PromptAlert.getText());
		PromptAlert.sendKeys("sekar");
		Thread.sleep(5000);
		PromptAlert.accept();
		WebElement outputmsg1 = driver.findElement(By.id("output"));
		System.out.println(outputmsg1.getText());
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
	}
	
	
}
