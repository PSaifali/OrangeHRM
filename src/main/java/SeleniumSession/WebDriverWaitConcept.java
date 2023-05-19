package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		By username = By.name("username");
		By password = By.name("password");
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		username_ele.sendKeys("Admin");
		*/
		
		waitForElementPresence(username, 5).sendKeys("Admin");
		getElement(password).sendKeys("admin123");
		if (waitForElementPresence(username, 4).isDisplayed()) {
			System.out.println("it is present");
		}
	}	
		
	
}
