package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHand {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country,4);
		Thread.sleep(3000);
		doSelectDropDownByValue(country,"Austria");
		Thread.sleep(3000);
		doSelectDropDownByVisibleText(country,"Brazil");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
    public static void doSelectDropDownByValue(By locator,String value) {
    	Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
    public static void doSelectDropDownByVisibleText(By locator,String text) {
    	Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
