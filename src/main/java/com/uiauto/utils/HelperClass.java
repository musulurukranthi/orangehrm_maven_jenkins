package com.uiauto.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uiauto.drivers.DriverManager;

public class HelperClass extends DriverManager {

	
	/**
	 * @param ele
	 * @param log
	 * @return
	 */
	public boolean isWebElementPresent(WebElement ele, String log){
		if(ele.isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * @param ele Pass the web element to perform click operation
	 * @param msg Pass the comment to the log
	 * @throws Exception
	 */
	public void clickElement(WebElement ele, String log) throws Exception {
		if (isWebElementPresent(ele, log)) {
			ele.click();
		} else
			throw new Exception("Not able to find the WebElement");
	}

	/**
	 * @param ele Pass the web element to perform send keys operation
	 * @param txt Pass the text to enter into the text box web element
	 * @param log Pass the log text 
	 * @throws Exception
	 */
	public void enterText(WebElement ele, String txt, String log) throws Exception {
		if (isWebElementPresent(ele, log)) {
			ele.clear();
			ele.sendKeys(txt);
		} else
			throw new Exception("Not able to find the WebElement");
	}
	
	/**
	 * @param ele
	 * @param log
	 * @return
	 */
	public String getElementText(WebElement ele, String log) {
		if(isWebElementPresent(ele, log)) {
			return ele.getText();
		}
		else
			return "";
	}
	
	public void clickElement(WebDriver driver, int timeout, WebElement ele, String value, String log) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(ele));
		ele.clear();
		ele.sendKeys(value);
	}
	
}
