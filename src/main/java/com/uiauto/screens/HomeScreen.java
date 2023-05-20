package com.uiauto.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.uiauto.utils.HelperClass;

public class HomeScreen extends HelperClass {

	WebDriver driver;

	/**
	 * @param driver
	 * @description Parameterized constructor used to initiate the driver along with
	 *              the webelements and action methods in the class
	 */
	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	################################# WebElements starts from here ##################################################

	@FindBy(how = How.XPATH, using = "//img[@alt='profile picture']//following-sibling::p")
	@CacheLookup
	private WebElement lgnUserName;

//	################################# Action Methods starts from here ##################################################

	public String vfyLgnUsrName(String log) {
		return getElementText(lgnUserName, log);
	}

}
