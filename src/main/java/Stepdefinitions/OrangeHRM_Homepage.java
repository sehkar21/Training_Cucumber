package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class OrangeHRM_Homepage   {

	BaseClass base;
	
	public OrangeHRM_Homepage(BaseClass base)
	{
		this.base=base;
	}

	@Given("iam on the homepage of the OrangeHrm")
	public void iam_on_the_homepage_of_the_orange_hrm() {

		//base.driver.quit();
		String currenturl = base.driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		

	}

	@Then("i click on the Admin tab on the left side")
	public void i_click_on_the_admin_tab_on_the_left_side() {


		WebElement Adminbtn = base.driver.findElement(By.xpath("//span[normalize-space()='Admin']"));
		Adminbtn.click();
	}

	@Then("i search for the employee")
	public void i_search_for_the_employee() throws InterruptedException {

      WebElement username = base.driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
	  username.sendKeys("Admin");
	  
	  WebElement userrole = base.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
	  userrole.click();
	  
	  base.driver.findElement(By.xpath("//div[@role='listbox']//div[2]")).click();	
	   //s.selectByValue("Admin");
	   
	   base.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Jos Butler");
	   Thread.sleep(4000);
	   base.driver.findElement(By.xpath("//div[@role='option']")).click();
	   
	  WebElement statusbtn =  base.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]"));
	  statusbtn.click();
	  
	  base.driver.findElement(By.xpath("//span[normalize-space()='Enabled']")).click();
	  
	}

	@Then("i click the search button")
	public void i_click_the_search_button() {
	    
		base.driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}
	
	
}
