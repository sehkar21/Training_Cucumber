package com.objectRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.BaseClass;

public class MyInfopageclass {

	BaseClass base;
	
	public MyInfopageclass(BaseClass base)
	{
		this.base=base;
	}
	
   	By MyInfoleftpanel = By.xpath("//span[normalize-space()='My Info']");
    By Myinfofirstname = By.cssSelector("input[placeholder='First Name']"); 
	By Myinfomiddlename = By.cssSelector("input[placeholder='Middle Name']");
	By Myinfolastname = By.xpath("//input[@placeholder='Last Name']");
	By Myinfoempid = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By Myinfootherid = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
	By Myinfodriverlicense = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]");
	By myinfosavebtn = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']");
	
	
	public void MyInfopanel() 
	{
		base.driver.findElement(MyInfoleftpanel).click();
	}
	
	public void  Myinfofirstname() throws AWTException, InterruptedException
	{
	
	     Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfofirstname)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
	     
	     Thread.sleep(3000);
	    		 
		//base.driver.findElement(Myinfofirstname).clear();
		base.driver.findElement(Myinfofirstname).sendKeys("albert");
		
	}
	
	public void  Myinfomiddlename()
	{
	
		Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfomiddlename)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
		//base.driver.findElement(Myinfomiddlename).clear();
		base.driver.findElement(Myinfomiddlename).sendKeys("raino");
	}
	
	public void  Myinfolastname()
	{
		//base.driver.findElement(Myinfolastname).clear();
		Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfolastname)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
		base.driver.findElement(Myinfolastname).sendKeys("mars");
	}
	
	public void  Myinfoempid()
	{
		//base.driver.findElement(Myinfoempid).clear();
		Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfoempid)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
		base.driver.findElement(Myinfoempid).sendKeys("12345");
	}
	
	public void  Myinfootherid()
	{
		//base.driver.findElement(Myinfootherid).clear();
		Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfootherid)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
		base.driver.findElement(Myinfootherid).sendKeys("123123");
	}
	
	public void  Myinfodriverlicense()
	{
		//base.driver.findElement(Myinfodriverlicense).clear();
		Actions acc = new Actions(base.driver);
	     acc.doubleClick(base.driver.findElement(Myinfodriverlicense)).keyDown(Keys.CONTROL)
	     .sendKeys("a")
	     .keyUp(Keys.CONTROL)
	     .sendKeys(Keys.BACK_SPACE)
	     .build()
	     .perform();
		base.driver.findElement(Myinfodriverlicense).sendKeys("789456");
	}
	public void myinfosavebtn() 
	{
		base.driver.findElement(myinfosavebtn).click();
	}
	
}
