package com.inetBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		
		//driver.get(baseURL);
		logger.info("URL is Launched");
		
		LoginPage lp = new LoginPage(driver);
		
		//lp.AdvancedBTN();
		//logger.info("Clicked on Advance Button");
		//lp.ProceedBTN();
		//logger.info("Clicked on Proceed Button");
		lp.setUserName(username);
		logger.info("Entered User Name");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clicksubmit();
		logger.info("Clicked on Submit Button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			logger.info("Login Test PASSED");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test FAILED");
		}
		
	}
	

}
