package com.bhimangroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimangroup.keywords.Constants;

public class LoginPage 
{
	@FindBy(css="#email")
	public WebElement emailOrPhoneTextBx;
	@FindBy(css="#pass")
	public WebElement passwordTextBox;
	@FindBy(css="button[name='login']")
	public WebElement submitbtn;
	public LoginPage() 
	{
	    PageFactory.initElements(Constants.driver, this);
	}
	
	public void emailOrPhoneTextBx(String emailOrPhone) 
	{
		emailOrPhoneTextBx.sendKeys(emailOrPhone);		
	}
	public void passwordTextBox(String pass) 
	{
		passwordTextBox.sendKeys(pass);
	}
	public void submitbtn() 
	{
		submitbtn.click();
	}
}
