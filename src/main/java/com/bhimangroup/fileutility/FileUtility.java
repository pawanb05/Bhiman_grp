package com.bhimangroup.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.bhimangroup.keywords.Constants;

public class FileUtility 
{
	/**
	 * This method will read specified key from specified file and will return the value associated with that key
	 * @param key key for which we want value
	 * @param fileName is a relative path of file along with name
	 */
	
	;
	public static String getProperty(String key,String fileName) 
	{
		try {
			 Constants.fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load properties file :"+fileName);
		}
		Constants.prop=new Properties();
		try {
			Constants.prop.load(Constants.fis);
		} catch (IOException e) {
			System.out.println("Unable to load properties file");
		}
		return Constants.prop.getProperty(key);
	}
	public static String getLocator(String locatorKey)
	{		String dir=System.getProperty("user.dir");

		return getProperty(locatorKey, "src/main/resources/com/utility/ObjectRepository.properties");
	}
	
	

}
