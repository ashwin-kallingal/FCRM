package com.fcrm.common;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/index.cfm?logout=1']")
	public WebElement logoutBtn;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);		
	}
	
	public void testLogout()
	{   
		driver.switchTo().frame("mainpanel");
		waitForElementPresent(logoutBtn);
		logoutBtn.sendKeys(Keys.ENTER);		
	}
}
