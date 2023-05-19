package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {

	static WebDriver driver;
	
	public static void main(String[] args) {
			
		By LoginPage_Username = By.name("username");
		By LoginPage_password = By.name("password");
		By LoginButton = By.xpath("//button[@type='submit']");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
		
		
		elementUtil ele = new elementUtil(driver);
		ele.waitForElementPresence(LoginPage_Username, 5).sendKeys("Admin");
		ele.waitForElementPresence(LoginPage_password, 5).sendKeys("admin123");
		ele.waitforElementToBeClickable(LoginButton, 5);	
	}

}
