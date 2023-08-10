package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaaleElemFElements {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/customers/");
		Thread.sleep(2000);
		List<WebElement> l = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
		for(int i=0;i<l.size();i++) {
			l.get(i).click();
			l = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));		
		}
	}
}
