package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		//By img = By.className("img-responsive");
		//By search = By.name("search");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		boolean flag = driver.findElement(By.className("img-responsive11")).isDisplayed();
		//this linw will give exception
		//elemnt is not avialable on the page
		System.out.println(flag);
		//no such element exception
		
	}

}
