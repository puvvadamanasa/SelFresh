package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofTextFields {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> l = driver.findElements(By.className("manasa"));
		//it will return empty list
		//driver.findele will throw NSE
		//if multiple element are found it will perform action on first element
		System.out.println(l.size());
	
	}

}
