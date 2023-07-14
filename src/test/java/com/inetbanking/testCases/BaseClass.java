package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL ="https://demo.guru99.com/V1/index.php";
	public String username ="mngr512423";
	public String password ="bEhybet";
	public static WebDriver driver;
	public static Logger Logger;
	
	@BeforeClass
	public void setup()
	{
		
	System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe")	;
	driver=new ChromeDriver();
	
	 Logger = Logger.getLogger("ebanking");
	PropertyConfigurator .configure("Log4j.properties");
	}
	
	@AfterClass
	public void teardown()
	{
		
	driver.quit();
	}
}
	