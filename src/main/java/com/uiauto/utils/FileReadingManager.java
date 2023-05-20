package com.uiauto.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileReadingManager {
	
	private FileInputStream fis;
	private static Properties prop;

	/**
	 * @consturctorName FileReadingManager
	 * @description	Initialize the properties file and load the data
	 */
	public FileReadingManager() {

		try {
			fis = new FileInputStream("src/test/resources/UIAutoProp.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

		}
	}

	/**
	 * @methodName getURL
	 * @return the url from the properties file
	 */
	public static String getURL() {
		return prop.getProperty("url");
	}
	
	/**
	 * @methodName getBrowser
	 * @return Browser name from the properties file
	 */
	public static String getBrowser() {
		return prop.getProperty("browser");
	}
	
	/**
	 * @methodName getUserName
	 * @return User name from the properties file
	 */
	public static String getUserName() {
		return prop.getProperty("username");
	}
	
	/**
	 * @methodName getPassword
	 * @return Password from the properties file
	 */
	public static String getPassword() {
		return prop.getProperty("password");
	}
	
	public static String getLgnUsrName() {
		return prop.getProperty("lgnusername");
	}
	
	
	
}
