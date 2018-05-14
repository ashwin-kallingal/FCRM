package com.fcrm.scripts;

import org.testng.annotations.Test;

import com.fcrm.base.BaseTest;
import com.fcrm.common.HomePage;
import com.fcrm.pages.LoginPage;
import com.fcrm.utilities.Excel;

public class VerifyLoginLogout2 extends BaseTest{
	
	public VerifyLoginLogout2()
	{
		AutoLoginRequired=false;
		AutoLogoutRequired=false;
	}
	
	@Test()
	
	public void testLoginLogout1() throws InterruptedException
	{
		String usn = Excel.getCellValue(INPUT_FILE, INPUT_SHEET, 1, 0);
		String pwd = Excel.getCellValue(INPUT_FILE, INPUT_SHEET, 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.testLogin(usn, pwd);
		
		Thread.sleep(10000);
		
		HomePage hp = new HomePage(driver);
		hp.testLogout();		
	}    
}