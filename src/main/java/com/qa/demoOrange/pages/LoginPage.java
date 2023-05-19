package com.qa.demoOrange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoOrange.Utils.Constants;
import com.qa.demoOrange.Utils.ElementUtils;

public class LoginPage  {

	private WebDriver driver;
	private ElementUtils elementsUtils;
	
	 private By username = By.name("username");
	 private By password = By.name("password");
	 private By LoingPageButton = By.xpath("//button[@type='submit']");
	 private By ForgotPasswork = By.linkText("Forgot your password?");
	 
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		elementsUtils = new ElementUtils(driver);
	}
	
	public String getLoginPageTitle() {
		return elementsUtils.waitForTitleToBe(Constants.LOGIN_PAGE_TITLE, 5);
	}
	
	public boolean isForgetPassWorkLink() {
		if (elementsUtils.getElements(ForgotPasswork).size() == Constants.Forgotten_Pwd_links)
			return true;
		return false;
	}
	
	public AdminPage doLogin(String un, String pwd) {
		
		elementsUtils.waitForElementPresent(username, 2).sendKeys(un);;
		elementsUtils.waitForElementPresent(password, 2).sendKeys(pwd);;
		elementsUtils.clickWhenReady(LoingPageButton, 5);
		return new AdminPage(driver);
	}
	
}
