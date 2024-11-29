package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class OrangeHRM_Steps {
	
	public static WebDriver driver;
	

	@Given("i launch the browser and enter into orangeHRM site")
	public void i_launch_the_browser_and_enter_into_orange_hrm_site() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@Given("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	  
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	
	
	
		

		
	}

	@Given("click on the login button")
	public void click_on_the_login_button() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

	@SuppressWarnings("deprecation")
	@Then("verify the homepage")
	public void verify_the_homepage() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
	}

	
}
