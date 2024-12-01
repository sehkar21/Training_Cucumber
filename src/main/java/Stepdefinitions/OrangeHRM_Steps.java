package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import Utils.BaseClass;

public class OrangeHRM_Steps {
	
	BaseClass base;
	
	public OrangeHRM_Steps(BaseClass base)
	{
		this.base=base;
	}

	

	@Given("i launch the browser and enter into orangeHRM site")
	public void i_launch_the_browser_and_enter_into_orange_hrm_site() {
	    
		WebDriverManager.chromedriver().setup();
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		base.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@Given("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	  
	WebElement usernames  = base.driver.findElement(By.name("username"));
	usernames.sendKeys(username);
	
	base.driver.findElement(By.name("password")).sendKeys(password);
	
	
	
		

		
	}

	@Given("click on the login button")
	public void click_on_the_login_button() {

		base.driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

	@SuppressWarnings("deprecation")
	@Then("verify the homepage")
	public void verify_the_homepage() 
	{
		String currenturl = base.driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		try {
			base.driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	
}
