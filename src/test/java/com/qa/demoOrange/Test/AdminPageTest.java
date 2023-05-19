package com.qa.demoOrange.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoOrange.Base.BaseTest;
import com.qa.demoOrange.Utils.Constants;

public class AdminPageTest extends BaseTest{

	@BeforeClass
	public void AdminPageSetUp() {
		 adminPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void accountsPageTitleTest() {
		String title = adminPage.getAdminPageTitle();
		System.out.println("acc page title is: " +title);
		Assert.assertEquals(title, Constants.Admin_Page_Tile);
	}
	
	@Test (priority = 2)
	public void AdminClickTest() {
		adminPage.AdminClick();
	}
	
}
