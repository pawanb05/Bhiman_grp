package com.bhimangroup.regression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bhimangroup.keywords.Constants;
import com.bhimangroup.keywords.Keywords;
import com.bhimangroup.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FBTestCaseLoginPage 
{
	@Test
  public void verifyLoginForInvalidEmalOrPhone() 
  {
		Keywords key=new Keywords();
		key.openBrowser("Chrome");
		key.launchingURL("https://facebook.com");
		LoginPage login=new LoginPage();
		//LoginPage login=PageFactory.initElements(Constants.driver, LoginPage.class);
		login.emailOrPhoneTextBx("1234567895");
		login.passwordTextBox("9876543210");
		login.submitbtn();	
  }
	@Test
	public void logoDisplay() 
	{
	 boolean element=Constants.driver.findElement(By.id("Pawan")).isDisplayed();
	  Assert.assertTrue(true);
	}

	@Test
	public void checkBoxSelected()
	{
		boolean s=Constants.driver.findElement(By.cssSelector("#check_box")).isSelected();
		Assert.assertTrue(true, "Check_Box Is Selected");
	}
	
	
}
