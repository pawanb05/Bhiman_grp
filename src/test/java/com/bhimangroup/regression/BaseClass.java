package com.bhimangroup.regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.bhimangroup.keywords.Constants;
import com.bhimangroup.keywords.Keywords;

public class BaseClass 
{
	
	@BeforeClass
	public void TC_login() throws InterruptedException 
	{
//		System.out.println("Enter Browser Name to run test cases...");
//		System.out.println("browsername should only include Chrome,IE,Firefox,Safari"
//				+ "No browsername apart from mentioned is allowed..");			 
//		Scanner sc= new Scanner(System.in);
//		String bname=sc.next();
		Keywords.openBrowser("Chrome");
		Keywords.maximizingWindow();
		Keywords.openURL("http://103.50.162.196/testing/user-login.php");
		Keywords.enterText("CSS", "#username", "9876543210");
		Keywords.enterText("CSS", "#password", "admin");
		Keywords.clickOnElement("XPATH", "//button[text()='Login']");
		Thread.sleep(1000);
//		Keywords.clickOnElement("XPATH", "//button[text()='OK']");
//		Thread.sleep(1000);
	}
	@AfterClass
	public void tearDown() throws InterruptedException 
	{ 
		Thread.sleep(3000);
         Constants.driver.close();
	}
	

}
