package com.objectRepo;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class PIMPageclass {

	BaseClass base;
	
	public PIMPageclass(BaseClass base)
	{
		this.base=base;
	}
	
	By PIMleftpanel = By.xpath("//span[normalize-space()='PIM']");
    By PIMAddemployee = By.xpath("//a[normalize-space()='Add Employee']"); 
	By PIMfirstname = By.xpath("//input[@placeholder='First Name']");
	By PIMMiddlename = By.xpath("//input[@placeholder='Middle Name']");
	By PIMLastname = By.xpath("//input[@placeholder='Last Name']");
	By PIMEmpID = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	By PIMSavebtn = By.xpath("//button[normalize-space()='Save']");
	
	public void PIMleftpanel()
	{
		base.driver.findElement(PIMleftpanel).click();
	}
	
	
	public void PIMAddemployee()
	{
		base.driver.findElement(PIMAddemployee).click();
	}
	
	
	public void PIMfirstname()
	{
		base.driver.findElement(PIMfirstname).sendKeys("albert");
	}
	
	
	public void PIMMiddlename()
	{
		base.driver.findElement(PIMMiddlename).sendKeys("raino");
	}
	
	
	public void PIMLastname()
	{
		base.driver.findElement(PIMLastname).sendKeys("mars");
	}
	
	
	public void PIMEmpID()
	{
		base.driver.findElement(PIMEmpID).sendKeys("00619");
	}
	
	
	public void PIMSavebtn()
	{
		base.driver.findElement(PIMSavebtn).click();
	}
	
	
}
