package com.bhimangroup.keywords;
import java.util.Iterator;

import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;


import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Opens specified Web Browser.
 * @param browserName should only include Chrome,IE,Firefox,safari
 * No browsername apart from mentioned is allowed..
 */

public class Keywords {
	private static final Logger LOG=Logger.getLogger(Keywords.class);
	
	//WebdriverOk driverOk = null;
	public static void openBrowser(String browserName) {
		BasicConfigurator.configure();
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			LOG.info("Chrome Launch");
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			System.out.println("IE Launch");
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			System.out.println("Firefox Launch");
			break;
		case "Safari":
			Constants.driver = new SafariDriver();
			System.out.println("Safari Launch");
			break;
		default:
			System.err.println("Invalid Browser Name :=" + browserName);
		}

	}
	/**
	 * It opens the specified url in Web Browser recently opened by driverOk instance
	 * 
	 * @param url {@code String} url to open
	 * @return void
	 */
	public static void launchingURL(String url) 
	{
		System.out.println(url +"Is Loading...");
		Constants.driver.get(url);
	}
	public static void openURL(String url) 
	{
		System.out.println(url+" Is Loading..");
		Constants.driver.get(url);

	}
	public static WebElement getWebelement(String locatorType,String locatorValue) 
	{
		WebElement element=null;
		switch (locatorType) {
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element=Constants.driver.findElement(By.id(locatorValue));
			break;
		case "CLASS":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
		case "LINK_TEXT":
			element=Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "NAME":
			element=Constants.driver.findElement(By.name(locatorValue));
			break;
		case "TAG_NAME":
			element=Constants.driver.findElement(By.tagName(locatorValue));
			break;
		default:
			System.err.println("Invalid Locator Type :"+locatorType +"Expected :XPATH,CSS,ID,CLASS,LINK_TEXT,PARTIAL_LINK_TEXT,NAME,TAG_NAME");
			break;
		}
		return element;

	}
	public static void clickOnElement(String locatorType,String locatorValue) 
	{
        getWebelement(locatorType, locatorValue).click();  
	}
	public static void enterText(String locatorType,String locatorValue,String textToEnter) 
	{
		getWebelement(locatorType, locatorValue).sendKeys(textToEnter);
		
	}
	
    public static void dropDown(String locatorType,String locatorValue, String visibleText) 
    {
    	WebElement element=getWebelement(locatorType, locatorValue);
    	Select select  = new Select(element);
    	select.selectByVisibleText(visibleText);
	}
    public static void radioButton(String locatorType, String locatorValue,String genderType) 
    {
    	WebElement male=getWebelement(locatorType, locatorValue);
    	WebElement female=getWebelement(locatorType, locatorValue);
    	if(genderType.equalsIgnoreCase("Male"))
    	{
    	   male.click();	
    	}
    	else if(genderType.equalsIgnoreCase("female"))
    	{
    		female.click();
    	}
	}
    public static void simpleAlertHandling() 
    { 
            Alert alert= Constants.driver.switchTo().alert();
            alert.accept();
	}
    public static void maximizingWindow()
    {
        Constants.driver.manage().window().maximize();
	}
    public static void moveToElement(String locatorType, String locatorValue) 
    {
    	Constants.action=new Actions(Constants.driver);
    	WebElement element=getWebelement(locatorType, locatorValue);
       Constants.action.moveToElement(element).build().perform();
    }
    public static void clear(String locatorType, String locatorValue) 
    {
    	WebElement element= getWebelement(locatorType, locatorValue);
    	element.clear();
	}
    public static void hardAssertion(String actual,String expected)
    {
    	Assert.assertEquals(actual, expected);

	}
    public static void getText(String locatorType, String locatorValue) 
    {
    	WebElement element= getWebelement(locatorType, locatorValue);
    	element.getText();
	}
   
}