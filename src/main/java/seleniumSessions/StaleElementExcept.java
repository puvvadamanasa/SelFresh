package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExcept {
public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("hai");
		driver.navigate().refresh();
		email = driver.findElement(By.id("input-email"));
		email.sendKeys("manasa");
//		WebElement fn = driver.findElement(By.id("input-firstname"));
//		fn.sendKeys(null);
//		String text = fn.getAttribute("value");
//		//illegal argument exception
//		System.out.println(text);
//		//elemnt not interactable exception
//		//element click intercepted exception
//		//xpath syntax is wring invalid selector exception
//		//no such element exception
	}

}
