package com.different;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	
	
	public void getDriver() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	}
	
