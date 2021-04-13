package com.bhimangroup.regression;
import org.openqa.selenium.support.PageFactory;
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

}
