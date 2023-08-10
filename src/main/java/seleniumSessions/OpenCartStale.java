package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartStale {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		for(int i=0;i<l.size();i++) {
			l.get(i).click();
			l = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		}

	}
	//click refresh back forward

}
