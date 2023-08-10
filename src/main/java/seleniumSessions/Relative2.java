package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class Relative2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement ele = driver.findElement(By.id("input-email"));
		String t = driver.findElement(with(By.tagName("h2")).above(ele)).getText();
		System.out.println(t);
		String t1 = driver.findElement(with(By.tagName("input")).below(ele)).getAttribute("id");
		System.out.println(t1);
		
	}
}
