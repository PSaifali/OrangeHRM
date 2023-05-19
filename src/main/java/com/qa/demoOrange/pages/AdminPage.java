package com.qa.demoOrange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoOrange.Base.BaseTest;
import com.qa.demoOrange.Utils.Constants;
import com.qa.demoOrange.Utils.ElementUtils;

public class AdminPage extends BaseTest{

	private ElementUtils elementUtil;
	
	private By Admin_SystemUser_AddBtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	private By SystemUser_UNameText = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By Admin_Menu_LeftPannel = By.xpath("(//a[@class='oxd-main-menu-item'])[1]");
	private By Admin_Pannel = By.linkText("Admin");
	
	public AdminPage(WebDriver driver){
		elementUtil = new ElementUtils(driver);
	}
	
	public String getAdminPageTitle() {
		return elementUtil.waitForTitleToBe(Constants.Admin_Page_Tile, 5); 
	}

	public void AdminClick() {
		elementUtil.waitForElementPresent(Admin_Pannel, 5).click();;
	}
	
	public void SearchSystemUser() {
		
	}
	
	public void Add_SystermUSer_Amin_Btn() throws InterruptedException {
		Thread.sleep(2000);
		elementUtil.doClick(Admin_SystemUser_AddBtn);
	}
	
	public void Add_UserName() {
		elementUtil.doSendKeys(SystemUser_UNameText, "abcd");
	}


}
