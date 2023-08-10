package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement el = driver.findElement(By.id("input-firstname"));
		el.sendKeys("manasa");
		String name = el.getAttribute("value");
		System.out.println(name);
		
		WebElement ln = driver.findElement(By.id("input-lastname"));
		ln.sendKeys(null);//illegal argument exception
		
	}
}
