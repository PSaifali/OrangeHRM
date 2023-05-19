package com.qa.demoOrange.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public WebDriver init_driver(Properties prop) {
		
		String browserName = prop.getProperty("browser");
		System.out.println("Browser name is: " +browserName);
	
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Please pass the correct browser: " +browserName);
			break;
		}
	
	return driver;

	}
	
	public Properties init_prop () {

		Properties prop = null;
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			 prop = new Properties();
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	return prop;
	}
}
