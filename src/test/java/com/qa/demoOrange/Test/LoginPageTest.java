package com.qa.demoOrange.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.demoOrange.Base.BaseTest;
import com.qa.demoOrange.Utils.Constants;

public class LoginPageTest extends BaseTest{

	@Test (priority = 1)
	public void verifyLoginPageTitleTest() {
		String title= loginPage.getLoginPageTitle();
		System.out.println("login page title is: " +title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test (priority = 2)
	public void verifyForgotPwdLinkTest() {
		Assert.assertTrue(loginPage.isForgetPassWorkLink());
	}
	
	@Test (priority = 3)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}