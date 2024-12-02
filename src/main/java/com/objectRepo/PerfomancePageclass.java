package com.objectRepo;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class PerfomancePageclass {

	
	BaseClass base;
	
	public PerfomancePageclass(BaseClass base)
	{
		this.base=base;
	}
	
	By perfomanceleftpanel = By.xpath("//span[normalize-space()='Performance']");
	By confirguretab = By.xpath("//span[normalize-space()='Configure']");
	By KPI_tracker = By.xpath("//a[normalize-space()='KPIs']");
	By jobtitledropdown = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
	By jobtitle = By.xpath("//span[normalize-space()='IT Manager']");
	By performancesearchbtn = By.xpath("//button[normalize-space()='Search']");
	
	public void perfomanceleftpanel() 
	{
		base.driver.findElement(perfomanceleftpanel).click();
	}
	
	public void confirguretab() 
	{
		base.driver.findElement(confirguretab).click();
	}
	
	public void KPI_tracker() 
	{
		base.driver.findElement(KPI_tracker).click();
	}
	
	public void jobtitledropdown() 
	{
		base.driver.findElement(jobtitledropdown).click();
	}
	
	public void jobtitle() 
	{
		base.driver.findElement(jobtitle).click();
	}
	
	public void performancesearchbtn() 
	{
		base.driver.findElement(performancesearchbtn).click();
	}
	
	
	
	
}
