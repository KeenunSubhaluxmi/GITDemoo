package com.inetbanking.testCases;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;
public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void logTest() {
		
		driver.get(baseURL);
		Logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		Logger.info("correct username");
		
		lp.setPassWord(password);
		Logger.info("correct password");
		lp.clickSubmit();
		Logger.info("submitted");
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			
		  AssertJUnit.assertTrue(true);	
		  Logger.info("URL is opened");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			Logger.info("Test failed");
		}
	}
	

}
	