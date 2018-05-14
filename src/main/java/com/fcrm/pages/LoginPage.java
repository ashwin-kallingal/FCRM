package com.fcrm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fcrm.common.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	public WebElement loginBtn;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);		
	}
	
	public void testLogin(String usn, String pwd)
	{		
		username.sendKeys(usn);
		password.sendKeys(pwd);
		loginBtn.sendKeys(Keys.ENTER);		
	}
}