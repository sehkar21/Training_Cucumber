package com.objectRepo;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class LogininfoPageclass {

	BaseClass base;
	
	
	public LogininfoPageclass(BaseClass base)
	{
		this.base=base;
		
	}
	
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginbtn = By.xpath("//button[normalize-space()='Login']");
	
	public void username()
	{
		base.driver.findElement(username).sendKeys("Admin");
	}
	
	public void password()
	{
		base.driver.findElement(password).sendKeys("admin123");
	}
	
	public void loginbtn()
	{
		base.driver.findElement(loginbtn).click();
	}
	
}
