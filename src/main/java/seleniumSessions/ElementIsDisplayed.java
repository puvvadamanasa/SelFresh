package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		By img = By.className("img-responsive");
		By search = By.name("search");
		By searchBtn = By.className("btn-default");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag);
		boolean flag =doElementIsDisplayed(img);
		System.out.println(flag);
		
		if(doElementIsDisplayed(search)) {
			doSendKeys(search, "macbook");
			doClick(searchBtn);
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
