package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterPart {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By footer = By.xpath("//footer//a");
		List<String> l = getElementsTextList(footer);
		System.out.println(l);
		System.out.println(l.size());
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String eleVal = e.getText();
			eleTextList.add(eleVal);
		}
		return eleTextList;
	}

}
