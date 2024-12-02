package Stepdefinitions;

import java.io.IOException;

import com.objectRepo.PerfomancePageclass;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM_Performance {

	BaseClass base;
	
	public OrangeHRM_Performance(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("user clicks on the performance left panel")
	public void user_clicks_on_the_performance_left_panel() {
	   
		PerfomancePageclass perfomance = new PerfomancePageclass(base);
		perfomance.perfomanceleftpanel();
	}
	@Then("user clicks on the configure tab and clicks on the KPI tracker")
	public void user_clicks_on_the_configure_tab_and_clicks_on_the_kpi_tracker() {

		PerfomancePageclass perfomance = new PerfomancePageclass(base);
		perfomance.confirguretab();
		perfomance.KPI_tracker();
	}
	@Then("user selects the job Title")
	public void user_selects_the_job_title() {
		PerfomancePageclass perfomance = new PerfomancePageclass(base);
		perfomance.jobtitledropdown();
		perfomance.jobtitle();
	}
	@Then("user clicks on the search button to see the results")
	public void user_clicks_on_the_search_button_to_see_the_results() throws IOException {
		PerfomancePageclass perfomance = new PerfomancePageclass(base);
		perfomance.performancesearchbtn();
		base.getscreenshot(base.driver, "perfomance_search.png");
		
	}

}
