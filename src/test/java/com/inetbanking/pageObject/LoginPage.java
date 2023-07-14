package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver){
		
		ldriver = rdriver;	
		PageFactory.initElements(rdriver, this);
	}
	@FindBy (name="uid")
	WebElement UserName;
	
	@FindBy (name="password")
	WebElement Password;
	
	@FindBy (name="btnLogin")
	WebElement LoginButton;
	
	public void setUserName(String uname)
	{
		UserName.sendKeys(uname);
	}
	
	public void setPassWord(String pwrd)
	{
		Password.sendKeys(pwrd);
	}
	
	public void clickSubmit()
	{
		LoginButton.click();
	}
	
}
