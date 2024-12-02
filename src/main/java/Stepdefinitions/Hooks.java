package Stepdefinitions;



import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	BaseClass base;
	public Hooks(BaseClass base)
	{
		this.base=base;
	}
	
	@Before
	public void openingbrowser()
	{
		System.out.println("-----------opening browser-----------");
	}
	

	@After
	public void teardown()
	{
		System.out.println("-----------closing browser-----------");
		//base.driver.quit();
	}
}
