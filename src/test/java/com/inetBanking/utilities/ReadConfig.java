package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


//This Method is Similar to Page Object Model and Create Constructor

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}  catch (Exception e) {
			
			System.out.println("Exception is " + e.getMessage());
			
		}
		
	}

	public  String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public  String getusername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	public  String getpassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public  String getChromePath()
	{
		String getChromePath = pro.getProperty("getChromePath");
		return getChromePath;
	}
	public  String getIEPath()
	{
		String getIEPath = pro.getProperty("getIEPath");
		return getIEPath;
	}
}

