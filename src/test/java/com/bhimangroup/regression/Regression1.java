package com.bhimangroup.regression;
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.bhimangroup.fileutility.FileUtility;
import com.bhimangroup.keywords.Constants;
import com.bhimangroup.keywords.Keywords;
@Listeners(com.bhimangroup.listner.Listerner.class)
public class Regression1 extends BaseClass
{
	private static final Logger LOG=Logger.getLogger(Regression1.class);
	

	@Test(groups= {"Login"})
	public void TC_01() throws InterruptedException 
	{
		BasicConfigurator.configure();
		Keywords.openBrowser("Chrome");
		Keywords.maximizingWindow();
		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
		Keywords.enterText("CSS", "#username", "9876543210");
		Keywords.enterText("CSS", "#password", "admin");
		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
		Thread.sleep(1000);
		LOG.info("Login Successfull..");
	
		
//		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
//		Thread.sleep(1000);
	}
	//@Test(groups= {"Login"})
//	public void TC_02() throws InterruptedException 
//	{		
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizingWindow();
//		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
//		Keywords.enterText("CSS", "#username", "1234567890");
//		Keywords.enterText("CSS", "#password", "admin");
//		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//		Thread.sleep(1000);
//		log.info("Login not Successfull..");
////		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////		Thread.sleep(1000);
//	}
//	@Test(groups= {"Login"})
//public void TC_03() throws InterruptedException 
//{		
//	Keywords.openBrowser("Chrome");
//	Keywords.maximizingWindow();
//	Keywords.openURL("http://103.50.162.196/testing/user-login.php");
//	Keywords.enterText("CSS", "#username", "9876543210");
//	Keywords.enterText("CSS", "#password", "admin123");
//	Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//	Thread.sleep(1000);
////	Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////	Thread.sleep(1000);
//}
//@Test(groups= {"Login"})
//public void TC_04() throws InterruptedException 
//{		
//	Keywords.openBrowser("Chrome");
//	Keywords.maximizingWindow();
//	Keywords.openURL("http://103.50.162.196/testing/user-login.php");
//	Keywords.enterText("CSS", "#username", "9876543210");
//	Keywords.enterText("CSS", "#password", "9876543210");
//	Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//	Thread.sleep(1000);	
//	log.info("Login not Successfull..");
//
////	Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////	Thread.sleep(1000);
//}
//	@Test(groups= {"Login"})
//public void TC_05() throws InterruptedException 
//{		
//	Keywords.openBrowser("Chrome");
//	Keywords.maximizingWindow();
//	Keywords.openURL("http://103.50.162.196/testing/user-login.php");
//	Keywords.enterText("CSS", "#username", "admin");
//	Keywords.enterText("CSS", "#password", "admin");
//	Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//	Thread.sleep(1000);
////	Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////	Thread.sleep(1000);
//	log.info("Login not Successfull..");
//
//}
//	@Test(groups= {"Login"})
// public void TC_06() throws InterruptedException 
//	{		
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizingWindow();
//		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
//		Keywords.enterText("CSS", "#username", "admin");
////		Keywords.enterText("CSS", "#password", "admin");
//		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//		Thread.sleep(1000);
////		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////		Thread.sleep(1000);
//		log.info("Login not Successfull..");
//
//	}
//	@Test(groups= {"Login"})
//	public void TC_07() throws InterruptedException 
//	{		
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizingWindow();
//		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
////		Keywords.enterText("CSS", "#username", "admin");
//		Keywords.enterText("CSS", "#password", "admin");
//		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//		Thread.sleep(1000);
////		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////		Thread.sleep(1000);
//	}
//	@Test(groups= {"Login"})
//	public void TC_08() throws InterruptedException 
//	{		
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizingWindow();
//		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
////		Keywords.enterText("CSS", "#username", "admin");
////		Keywords.enterText("CSS", "#password", "admin");
//		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
//		Thread.sleep(1000);
////		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
////		Thread.sleep(1000);
//		log.info("Login not Successfull..");
//
//	}
//	@Test(priority = 1)
//	public void formFillUp() throws InterruptedException 
//	{
//       Keywords.clickOnElement("LINK_TEXT", "View Branches");
//       Thread.sleep(1000);
//       Keywords.clickOnElement("XPATH", "//a[text()='Add Branch']");
//       Thread.sleep(2000);
//       Keywords.enterText("CSS", "input#branch_name", "Central Bank of India");
//       Thread.sleep(1000);
//       Keywords.enterText("CSS", "input#branch_address", "Karve Nagar");
//       Keywords.enterText("CSS", "input#city", "Pune");
//       Keywords.enterText("CSS", "input#contact_no1", "9234567890");
//       Thread.sleep(1000);
//       Keywords.enterText("CSS", "input#contact_no2", "9876543210");
//       Thread.sleep(1000);
//       Keywords.enterText("CSS", "input#email_id", "lapi@gmail.com");
//       Keywords.clickOnElement("CSS", "input[type*='submit']");
//       Thread.sleep(2000);
//       Keywords.clickOnElement("XPATH", "//button[text()='OK']");
//	}
//	@Test(priority = 2)
//	public void addCustomer() throws InterruptedException 
//	{
//		Thread.sleep(3000);
//		Keywords.clickOnElement("XPATH", "//a[text()='View Customers']");
//		Keywords.clickOnElement("CSS", "#add_btn");
//		Keywords.enterText("CSS","#customer_name", "Virat Sharma");
//		Keywords.enterText("CSS", "#mobile_no", "1234567890");
//		Keywords.enterText("CSS", "#email", "laptop@gmail.com");
//		Keywords.enterText("CSS", "#address", "pune");
//		Keywords.enterText("CSS", "#state", "MH");
//		Keywords.enterText("CSS", "#district", "pune");
//		Keywords.enterText("CSS", "#taluka", "pune");
//		Keywords.enterText("CSS", "#city", "pune");
//		Keywords.enterText("CSS", "#pincode", "444908");
//		Keywords.enterText("CSS", "#birth_date", "16-02-2020");
//		Keywords.enterText("CSS", "#anniversary_date", "05-10-2021");
//		Thread.sleep(2000);
//		Keywords.enterText("CSS", "#occupation", "Farmer");
//		Thread.sleep(3000);
//	    Constants.driver.executeScript("window.scrollBy(0,600)");
//		Keywords.clickOnElement("XPATH", "//input[@name='add_customer']");
//
//		
//	}
	
//	@Test(groups= {"Masters"})
//	 public void addBanks() 
//	{
//		Keywords.moveToElement("XPATH", FileUtility.getLocator("masters"));
//		Keywords.moveToElement("XPATH", FileUtility.getLocator("bank"));
//		Keywords.clickOnElement("XPATH", FileUtility.getLocator("bank"));
//		Keywords.clickOnElement("CSS", FileUtility.getLocator("addbank") );
//		Keywords.enterText("CSS", FileUtility.getLocator("bankname"),"Central Bank Of India");
//		Keywords.enterText("CSS", FileUtility.getLocator("accname"), "Laptop");
//		Keywords.enterText("CSS", FileUtility.getLocator("accno"),"12345698778");
//		Keywords.dropDown("CSS", FileUtility.getLocator("banktype"), "Savings");
//		Keywords.enterText("CSS", FileUtility.getLocator("ifsccode"),"CBIN0285050");
//		Keywords.enterText("CSS", FileUtility.getLocator("micrcode"),"123456789");
//		Keywords.clickOnElement("XPATH", FileUtility.getLocator("submitbutton"));
//		Keywords.clickOnElement("XPATH", "//button[text()='OK']");		
		
//	}
//	@Test(groups= {"Masters"})
//	public void searchBank() 
//	{
//		Keywords.moveToElement("XPATH", "//span[text()='Masters']");
//		Keywords.moveToElement("XPATH", "//a[text()='Banks ']");
//		Keywords.clickOnElement("XPATH", "//a[text()='Banks ']");
//		Keywords.enterText("XPATH", "//input[@type='search']", "Central bank");
//		
//		
//	}
//	@Test(groups= {"Masters"})
//	public void deleteBank() 
//	{
//		Keywords.moveToElement("XPATH", "//span[text()='Masters']");
//		Keywords.moveToElement("XPATH", "//a[text()='Banks ']");
//		Keywords.clickOnElement("XPATH", "//a[text()='Banks ']");
//		Keywords.clickOnElement("XPATH", "//i[@class=' fa fa-trash']");
//		Keywords.simpleAlertHandling();
//		
//	}
//	@Test(groups= {"Masters"})
//	public void editBankDetails() 
//	{
//		Keywords.moveToElement("XPATH", "//span[text()='Masters']");
//		Keywords.moveToElement("XPATH", "//a[text()='Banks ']");
//		Keywords.clickOnElement("XPATH", "//a[text()='Banks ']");
//		Keywords.clickOnElement("XPATH", "//td//button[1][@data-id='6']");
//		Keywords.enterText("CSS", "input#bank_name","IDBI");
//		Keywords.enterText("CSS", "input#account_name", "Kalpana Sen");
//		Keywords.clear("CSS", "input#account_no");
//		Keywords.enterText("CSS", "input#account_no","44444444444");
//		Keywords.dropDown("CSS", "select#bank_account_type", "Savings");
//		Keywords.enterText("CSS", "input#ifsc_code","IDBI841104");
//		Keywords.enterText("CSS", "input#micr_code","480000400");
//		Keywords.clickOnElement("XPATH", "//input[@type='submit']");
//	}

	

}




