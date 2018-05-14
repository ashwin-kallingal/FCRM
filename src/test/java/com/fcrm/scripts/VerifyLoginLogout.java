package com.fcrm.scripts;

import org.testng.annotations.Test;
import com.fcrm.base.BaseTest;

public class VerifyLoginLogout extends BaseTest
{	
	public VerifyLoginLogout()
	{
		AutoLoginRequired=false;
		AutoLogoutRequired=false;
	}
	
	@Test()
	
	public void testLoginLogout1() throws InterruptedException
	{
			log.info("Verified LoginLogout");
	}    
}