package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class Static_DropDown {

	
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\sehka\\eclipse-workspace\\Training_Cucumber\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().alert().getText();
		
		WebElement e1 = driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		e1.click();
		e1.sendKeys("pune");
		
	//	WebElement e2 = driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]"));
     //   e2.click();
        
		
		try
		    {
		       driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
		     }
		catch(Throwable e)
		     {
		         WebElement e2 = driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]"));
		         e2.click();
		         e.printStackTrace();
		      } 
		      
         
         WebElement e3 = driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
         e3.click();
         e3.sendKeys("Chennai");
         
         driver.findElement(By.cssSelector("body app-root app-home[class='ng-star-inserted'] div[id='divMain'] div app-main-page[class='ng-star-inserted'] div[class='main-back'] div[class='jp-radious'] div[class='col-xs-12 level_2 slanted-div'] div[class='col-xs-12 remove-padding tbis-box tbis-box-pad'] div[class='col-sm-6 remove-padding'] app-jp-input[class='ng-star-inserted'] div[class='level_1_1 col-xs-12 remove-padding jp-form'] form[class='ng-invalid ng-touched ng-dirty'] div[class='form-swap col-xs-12 remove-padding'] div[class='col-md-7 col-xs-12 remove-padding'] div[class='form-group ui-float-label'] p-autocomplete[id='destination'] span[class='ng-tns-c57-9 ui-autocomplete ui-widget'] div[class='ng-trigger ng-trigger-overlayAnimation ng-tns-c57-9 ui-autocomplete-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted'] ul[id='pr_id_2_list'] li:nth-child(1) span:nth-child(1)")).click();
		
		
	}
	
	
}
