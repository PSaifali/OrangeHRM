package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementUtil {

	public WebDriver driver;
	
	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public  WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

	
	public boolean waitForUrlToBe(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.urlContains(urlValue));	
	}
	
	public Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void acceptJSAlert(int timeout) {
		waitForAlert(timeout).accept();
	}
	
	public void dismissJSAlert(int timeout) {
		waitForAlert(timeout).dismiss();
	}
	
	public String getAlertText(int timeout) {
		return waitForAlert(timeout).getText();
	}
	
	public String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public void waitforElementToBeClickable(By locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	WebElement elementClick = wait.until(ExpectedConditions.elementToBeClickable(getElement(locator)));
	elementClick.click();
	}
}
