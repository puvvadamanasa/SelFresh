package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchScen {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ibm");
		Thread.sleep(2000);
		By search = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doSearch(search,"full");

	}
	public static void doSearch(By locator,String suggName) {
		List<WebElement> l = driver.findElements(locator);
		System.out.println(l.size());
		for(WebElement e:l) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);
			}
		}
	}

}
