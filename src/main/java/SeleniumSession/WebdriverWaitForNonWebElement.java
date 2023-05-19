package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWaitForNonWebElement {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//url
		//driver.get("https://www.dollartreecanada.com/");
	
		//alerts:
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By signButton = By.name("proceed");
		
		elementUtil ele = new elementUtil(driver);
		String title = ele.waitForTitleToBe("Rediff", 5);
		System.out.println("page title is: " +title);
		
		ele.waitForElementPresence(signButton, 5).click();
		/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alter= wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alter.getText());
		alter.accept();
		*/
		
		ele.acceptJSAlert(5);
		
		//By offer_menuTab = By.xpath("(//a[text()='Careers'])[1]");
		
		//url -->ele.waitForElementPresence(offer_menuTab, 5).click();;
		
		//url
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * boolean flag=wait.until(ExpectedConditions.urlContains("careers"));
		 * System.out.println(flag);
		 
	
		if(ele.waitForUrlToBe("careers", 5)) {
			System.out.println("Corrent career url....");
		}
		*/
		
	}

}
