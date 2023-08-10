package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElementConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		    driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			By email = By.id("input-email11");
			By pwd = By.id("input-password");
			By loginBtn = By.xpath("//input[@value='Login']");
			
			waitForElementPresence(email,10);
			getElement(pwd).sendKeys("manu");
			getElement(loginBtn).click();

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page 
	 * and visible.Visibility means that the element is not only displayed 
	 * but also has a height and width that is greater than 0
	 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
