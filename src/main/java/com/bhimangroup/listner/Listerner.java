package com.bhimangroup.listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bhimangroup.keywords.Constants;

public class Listerner implements ITestListener
{
	private static Logger LOG=Logger.getLogger(Listerner.class);
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {

		BasicConfigurator.configure();
		LOG.info("Test Case Successfully Executed..");
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String dir=System.getProperty("user.dir");
	     File Screenshots=Constants.driver.getScreenshotAs(OutputType.FILE);
	     try {
	    	 System.out.println("Taking Screnshots..");
			FileUtils.copyFile(Screenshots, new File(dir+"/src/Screenshots/FailCase.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
