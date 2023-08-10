package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromSection {
	public static WebDriver driver;
	public static void main(String[] args) {	
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			By links = By.xpath("//aside[@id='column-right']//a");
//			List<WebElement> l = driver.findElements(links);
//			System.out.println(l.size());
//			for(WebElement e:l) {
//				String text = e.getText();
//				System.out.println(text);
//			}
			List<String> l = getElementsTextList(links);
			System.out.println(l);
			System.out.println(l.contains("Register"));
			System.out.println(l.contains("Login"));
			System.out.println(l.contains("My Account"));
			
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

}
