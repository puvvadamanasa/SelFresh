package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		By links = By.tagName("a");
		By images = By.tagName("img");
    	//List<WebElement> l = getElements(links);
    	getElementAttributes(links,"href");
    	getElementAttributes(images, "src");
//		for(WebElement e:l) {
//			String hrefValue = e.getAttribute("href");
//			String text = e.getText();
//			System.out.println(text+" ---------> "+hrefValue);
//		}
		
//		List<WebElement> im = getElements(images);
//		System.out.println(im.size());
//		for(WebElement e:im) {
//			String sr = e.getAttribute("src");
//			System.out.println(sr);
//		}
		
		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getElementAttributes(By locator,String attrName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);
		}
	}
	

}
