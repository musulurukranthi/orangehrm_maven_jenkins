package com.uiauto.drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.uiauto.utils.FileReadingManager;

public class DriverManager {

	private static String browserName;
	private static WebDriver driver;

	public DriverManager() {

	}

	public static WebDriver getDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); // By default chrome 111 is not invoking working properly so added this line
		browserName = FileReadingManager.getBrowser();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(FileReadingManager.getURL());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		return driver;

	}

	/**
	 * 
	 */
	public static void quitDriver() {
		driver.quit();
	}

}
