package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	public void i_click_on_the_apply_tab() throws InterruptedException {
	
	   WebElement FromLeave= base.driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]"));
		FromLeave.click();
		
		Thread.sleep(3000);
		
		WebElement fromdatemonthdropdown = base.driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']"));
		fromdatemonthdropdown.click();
		
		Thread.sleep(3000);
		
		WebElement fromdatemonth =base.driver.findElement(By.xpath("//li[normalize-space()='November']"));
		fromdatemonth.click();
		
		Thread.sleep(3000);
		
		WebElement Leavestartdate = base.driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][normalize-space()='15']"));
		Leavestartdate.click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)base.driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		
		 WebElement ToLeave= base.driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]"));
	     ToLeave.click();
	     
	     Thread.sleep(3000);
	     
	     
	     
	     WebElement monthselectswipe = base.driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']"));
	     monthselectswipe.click();
	     
	    /* WebElement monthselect = base.driver.findElement(By.xpath("//li[@class='oxd-calendar-dropdown--option --selected']"));
	     monthselect.click();
	     */
	     Thread.sleep(3000);
		
		WebElement Leaveenddate = base.driver.findElement(By.xpath("//div[contains(text(),'30')]"));
		Leaveenddate.click();
		 Thread.sleep(3000);
		 
		 WebElement statusdropdown = base.driver.findElement(By.xpath("//div[@class='oxd-multiselect-wrapper']//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		 statusdropdown.click();
		 
		 WebElement leavestatus = base.driver.findElement(By.xpath("//div[@role='listbox']//div[1]"));
		 leavestatus.click();
		 
		 WebElement pastEmpbutton = base.driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		 pastEmpbutton.click();
		
	}
	@Then("i apply leave")
	public void i_apply_leave() throws InterruptedException {
		
		WebElement serachbutton = base.driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		serachbutton.click();
		Thread.sleep(3000);
	}
	@Then("i click on the submit button")
	public void i_click_on_the_submit_button() {
		WebElement Applytabbtn = base.driver.findElement(By.xpath("//a[normalize-space()='Apply']"));
		Applytabbtn.click();
		
		
	}

	
}
