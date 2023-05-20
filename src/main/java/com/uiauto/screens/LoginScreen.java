package com.uiauto.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.uiauto.utils.HelperClass;

/**
 * @author MKRANTHI
 * @description Page Factory for the Login screen, contains web elements and action methods
 */
public class LoginScreen extends HelperClass{
	
	WebDriver driver;
	
	/**
	 * @param driver
	 * @description Parameterized constructor used to initiate the driver along with the webelements and action methods in the class 
	 */
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	################################# WebElements starts from here ##################################################
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	@CacheLookup private WebElement username;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'orangehrm-login-button')]")
	@CacheLookup private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(.,'Forgot your password?')]")
	@CacheLookup private WebElement forgotPasswordLink;
	
	
//	################################# Action Methods starts from here ##################################################

	/**
	 * @param log
	 * @return
	 */
	public boolean vfyLgnBtnPresent(String log) {
		return isWebElementPresent(loginButton, log);
	}
	
	/**
	 * @description By using this method we can enter the text in the UserName text box
	 */
	public void enterUserName(String txt, String log) {
		try {
			enterText(username, txt, log);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param txt
	 * @param log
	 */
	public void enterPassword(String txt, String log) {
		try {
			enterText(password, txt, log);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickLoginBtn(String log) {
		try {
			clickElement(loginButton, log);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
