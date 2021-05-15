package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "CucumberFeatures",
		glue="com.stepdefinition"
		
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
