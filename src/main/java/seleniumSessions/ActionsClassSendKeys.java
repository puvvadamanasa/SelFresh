package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSendKeys {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By ctnBtn = By.cssSelector("input[type='submit']");
		doActionSendKeys(fname,"manasa");
		doActionSendKeys(lname,"puvvada");
		doActionsClick(ctnBtn);		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		
		act.click(getElement(locator)).build().perform();
	}

}
