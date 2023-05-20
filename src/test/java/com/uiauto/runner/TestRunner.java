package com.uiauto.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/java/com/uiauto/features" }, 
		glue = { "com.uiauto.stepdefs", "com.uiauto.hooks"}, 
		dryRun = false, 
		plugin = { "pretty","html:target/cucumber-out/cucumber.html"}, 
		tags = "@smoke",
		monochrome = true

)
public class TestRunner {

}
