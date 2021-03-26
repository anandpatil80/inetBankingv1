package com.inetBanking.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	//#############################################
	//Created on 15-Mar-21-Valid till 03 April 21
	//User ID :	mngr314391
	//Password :	tazytYd
	//#############################################
	
	public String baseURL = "http://demo.guru99.com/v4/";
	public String username="mngr314391";
	public String password="tazytYd";
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
			
	{
		
		String ProjectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4J.properties");
		
		
		driver.get(baseURL);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	//generate random email IDs using below user defined method and use same in above TC//
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	//Generate random number required and use in TC's//
	public String randomnumber()
	{
		String generatedstring2 = RandomStringUtils.randomNumeric(8);
		return(generatedstring2);
	}
	
	
	
}