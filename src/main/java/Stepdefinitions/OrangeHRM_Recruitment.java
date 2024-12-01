package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM_Recruitment {

	BaseClass base;
	public OrangeHRM_Recruitment(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("user clicks on the recruitment left panel")
	public void user_clicks_on_the_recruitment_left_panel() {
	    
		WebElement Leftpanelrecruitment  = base.driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']"));
		Leftpanelrecruitment.click();
	}
	@Then("user clicks on the vacancies tab")
	public void user_clicks_on_the_vacancies_tab() {

		WebElement vacaniestab = base.driver.findElement(By.xpath("//a[normalize-space()='Vacancies']"));
		vacaniestab.click();

		
	}
	@Then("user enters the vacanies details")
	public void user_enters_the_vacanies_details() {

		WebElement jobtitledropdown = base.driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
		jobtitledropdown.click();
		
		WebElement jobtitle = base.driver.findElement(By.xpath("//span[normalize-space()='Network Administrator']"));
		jobtitle.click();
		
		JavascriptExecutor js = (JavascriptExecutor)base.driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		
		WebElement vacanydropdown = base.driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
		vacanydropdown.click();
		
		WebElement vacanytitle = base.driver.findElement(By.xpath("//span[normalize-space()='Software Engineer']"));
		vacanytitle.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor)base.driver;
		js1.executeScript("window.scrollBy(0,-250)", "");
		
		WebElement Hiringdropdown = base.driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
		Hiringdropdown.click();
		
		WebElement Hiringtitle = base.driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[3]"));
		Hiringtitle.click();
		
		WebElement Statusdropdown = base.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
		Statusdropdown.click();
		
		WebElement Statustitle = base.driver.findElement(By.xpath("//span[normalize-space()='Active']"));
		Statustitle.click();
		
		
		
	}
	@Then("user clicks on the search")
	public void user_clicks_on_the_search() {

		WebElement vacancysearch = base.driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		vacancysearch.click();
		
	}



	
}
