package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		By links = By.tagName("a");
		//List<WebElement> l = getElements(links);
		int count = getTotalElementsCount(links);
		System.out.println(count);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getTotalElementsCount(By locator) {
		int eleCount =  getElements(locator).size();
		System.out.println("Total elements for: "+locator+"----->"+eleCount);
		return eleCount;
	}

}
