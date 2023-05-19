package SeleniumSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElements {
		
		static WebDriver driver;
		
		public static void main(String[] args) {
				
			By FooterLink = By.xpath("//div[@class='orangehrm-login-footer-sm']/a");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
			
			List<WebElement> linksList = driver.findElements(By.tagName("a"));
			
			System.out.println("total links: " + linksList.size());
			
			for(int i=0; i<linksList.size(); i++) {
				String text = linksList.get(i).getText();
				
				if(!text.isEmpty()) {
					System.out.println(i + "-->" + text);
					String url = linksList.get(i).getAttribute("href");
					System.out.println(url);
				}
				
			/*
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			List<WebElement> List_ele =	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FooterLink));
			
			for (WebElement ele : List_ele) {
				String text = ele.getText();
				System.out.println(text);
			}
			*/
			//List_ele.stream().forEach(ele -> System.out.println(ele.getText()));
			}}
}
