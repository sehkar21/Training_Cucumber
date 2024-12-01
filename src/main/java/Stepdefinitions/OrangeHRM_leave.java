package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM_leave {

	BaseClass base;
	public OrangeHRM_leave(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("i land on the Leave page")
	public void i_land_on_the_leave_page() throws InterruptedException {

		Thread.sleep(5000);
		WebElement Leavepanel = base.driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
		Leavepanel.click();
		//base.driver.close();
		
	}
	@Then("i click on the Apply tab")
	public void i_click_on_the_apply_tab() {
	
		
	}
	@Then("i apply leave")
	public void i_apply_leave() {
	    
		
	}
	@Then("i click on the submit button")
	public void i_click_on_the_submit_button() {
		
		
	}

	
}
