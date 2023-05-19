package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	static WebDriver driver; 
	
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
	List<WebElement>	totallink = driver.findElements(By.tagName("a"));

	System.out.println(totallink.size());
	for (WebElement e : totallink) {
		System.out.println(e.getText());
	
		if(!totallink.isEmpty()) {
			System.out.println(e.getText());
		}
	}
	}

}