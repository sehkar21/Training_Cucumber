package Stepdefinitions;

import java.io.IOException;

import com.objectRepo.LogininfoPageclass;
import com.objectRepo.PIMPageclass;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM_PIM {

	BaseClass base;
	
	public OrangeHRM_PIM(BaseClass base)
	{
		this.base=base;
	}
	
	@Given("i login into in the Orange HRM site")
	public void i_login_into_in_the_orange_hrm_site() throws InterruptedException, IOException {

		BaseClass.getbrowser();
		
	}

	@Then("i enter the username and password in the orangeHRM site")
	public void i_enter_the_username_and_password_in_the_orange_hrm_site() {

		LogininfoPageclass LogininfoPageclass = new LogininfoPageclass(base);
		LogininfoPageclass.username();
		LogininfoPageclass.password();
		
	}

	@Then("i click the Login button in OrangeHRM site")
	public void i_click_the_login_button_in_orange_hrm_site() {

		LogininfoPageclass LogininfoPageclass = new LogininfoPageclass(base);
		LogininfoPageclass.loginbtn();
		
	}

	@Given("user clicks on the PIM left panel in the homepage of orangeHRM")
	public void user_clicks_on_the_pim_left_panel_in_the_homepage_of_orange_hrm() {

		PIMPageclass PIMPageclass = new PIMPageclass(base);
				PIMPageclass.PIMleftpanel();
		
	}

	@Then("user clicks on the Add employee tab")
	public void user_clicks_on_the_add_employee_tab() {

		PIMPageclass PIMPageclass = new PIMPageclass(base);
		PIMPageclass.PIMAddemployee();
	}

	@Then("user enters the details in the site")
	public void user_enters_the_details_in_the_site() {
		PIMPageclass PIMPageclass = new PIMPageclass(base);
		PIMPageclass.PIMfirstname();
		PIMPageclass.PIMMiddlename();
		PIMPageclass.PIMLastname();
		PIMPageclass.PIMEmpID();
		

		
	}

	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		
		PIMPageclass PIMPageclass = new PIMPageclass(base);
		PIMPageclass.PIMSavebtn();

		
	}
}
