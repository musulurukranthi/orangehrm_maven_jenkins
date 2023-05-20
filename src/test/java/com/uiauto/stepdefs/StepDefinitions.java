package com.uiauto.stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.uiauto.drivers.DriverManager;
import com.uiauto.screens.HomeScreen;
import com.uiauto.screens.LoginScreen;
import com.uiauto.utils.FileReadingManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	LoginScreen ls;
	HomeScreen hm;

	public StepDefinitions() {
		driver = DriverManager.getDriver();
		ls = new LoginScreen(driver);
		hm = new HomeScreen(driver);
	}

	@Given("user should be in the login page")
	public void user_should_be_in_the_login_page() {
		Assert.assertEquals(ls.vfyLgnBtnPresent("Verify Login Button"), true);
	}
	@Given("enter the valid username and password")
	public void enter_the_valid_username_and_password() {
		ls.enterUserName(FileReadingManager.getUserName(), "Enter the User Name");
		ls.enterPassword(FileReadingManager.getPassword(), "Enter the Password");
	}
	@When("click on login button")
	public void click_on_login_button() {
		ls.clickLoginBtn("Click the login Button");
	}
	@Then("validate the user should be navigated to dashboard page")
	public void validate_the_user_should_be_navigated_to_dashboard_page() {
		String usrName = hm.vfyLgnUsrName("Verifying the logged in user name");
		Assert.assertEquals(usrName , FileReadingManager.getLgnUsrName());
	}








}
