package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitwithElements {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footer = By.cssSelector("footer a");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//List<WebElement> l = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		//System.out.println(l.size());
		
		List<WebElement> l = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		System.out.println(l.size());

	}

}
