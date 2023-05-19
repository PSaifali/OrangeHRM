package com.qa.demoOrange.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demoOrange.factory.DriverFactory;
import com.qa.demoOrange.pages.AdminPage;
import com.qa.demoOrange.pages.LoginPage;

public class BaseTest {
 
	WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public LoginPage loginPage;
	public AdminPage adminPage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
