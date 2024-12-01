package Stepdefinitions;

import java.awt.AWTException;

import com.objectRepo.MyInfopageclass;

import Utils.BaseClass;
import io.cucumber.java.en.Then;

public class OrangeHRM_MyInfo {

	BaseClass base;
	
	public OrangeHRM_MyInfo(BaseClass base)
	{
		this.base=base;
	}
	
	@Then("click on the myinfo left panel")
	public void click_on_the_myinfo_left_panel() {

		MyInfopageclass myinfo = new MyInfopageclass(base);
		myinfo.MyInfopanel();
			
	}
	
	@Then("user enters the details")
	public void user_enters_the_details() throws InterruptedException, AWTException {
	   
		Thread.sleep(5000);
		
		MyInfopageclass myinfo = new MyInfopageclass(base);
		myinfo.Myinfofirstname();
	
		myinfo.Myinfomiddlename();
		myinfo.Myinfolastname();
	myinfo.Myinfoempid();
	myinfo.Myinfootherid();
	myinfo.Myinfodriverlicense();
	
		
	}

	@Then("user saves the page")
	public void user_saves_the_page() {

		MyInfopageclass myinfo = new MyInfopageclass(base);
		myinfo.myinfosavebtn();
		
	}

	
}
