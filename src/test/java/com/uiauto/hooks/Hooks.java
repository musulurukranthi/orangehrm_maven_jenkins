package com.uiauto.hooks;

import com.uiauto.drivers.DriverManager;
import com.uiauto.utils.FileReadingManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void runFirst(Scenario scenario) {
		System.out.println("######################### Scenario: "+scenario.getName()+" Starts here #########################");
		FileReadingManager frm = new FileReadingManager();
		
	}
	
	@After
	public void runLast(Scenario scenario) {
		System.out.println("######################### Scenario: "+scenario.getName()+" Ends here #########################");
		DriverManager.quitDriver();
	}

}
