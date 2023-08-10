package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTesting {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		By x = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doSearch(x,"");
		
		
	}
	public static void doSearch(By locator,String suggName) {
		List<WebElement> suggList = driver.findElements(locator);
		System.out.println(suggList.size());
		for(WebElement e:suggList) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);
			}
//			if(text.contains(suggName)) {
//				e.click();
//				break;
//			}
		}
	}

}