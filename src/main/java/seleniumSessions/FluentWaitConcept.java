package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By loc = By.cssSelector("a[aria-label='Free trial11']");
		
		waitForElementPresenceWithFluentWait(10,0,loc).click();
		
		

	}
	public static WebElement waitForElementPresenceWithFluentWait(int timeout,int pollingTime,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				               .withTimeout(Duration.ofSeconds(timeout))
				               .ignoring(NoSuchElementException.class)
				               .ignoring(StaleElementReferenceException.class)
				               .pollingEvery(Duration.ofSeconds(pollingTime))
				               .withMessage("Element not found");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
     }
	public static void waitForAlertWithFluentWait(int timeout,int pollingTime,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				               .withTimeout(Duration.ofSeconds(timeout))
				               .ignoring(NoAlertPresentException.class)
				               .pollingEvery(Duration.ofSeconds(pollingTime))
				               .withMessage("alert is not present");
		wait.until(ExpectedConditions.alertIsPresent());
		
     }

}
