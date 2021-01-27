package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest()
	{
		
		logger.info("URL is opened");
		
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
			
	}

}
