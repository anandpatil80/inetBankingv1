package com.inetBanking.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void AddNewCuatomer() throws InterruptedException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User Name is Entered");
		lp.setPassword(password);
		logger.info("Password is Entered");
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("Providing Customer Details");
		addcust.CustName("Anand");
		addcust.custgender("male");
		addcust.custdob("06", "05", "1980");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custcity("Pune");
		addcust.custstate("MAHARASHTRA");
		addcust.custpinno("412101");
		addcust.custtelephoneno("1233213219");
		String email=randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		logger.info("Validation Started");
		
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}
				
	}

}
