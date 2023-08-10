package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String fname = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(fname);
//		String src = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		System.out.println(src);
//		String tit = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(tit);
		By fname = By.id("input-firstname");
		By src = By.className("img-responsive");
	
		
		String f = getElementAttribute(fname,"placeholder");
		String f1 = getElementAttribute(src,"src");
		String f2 = getElementAttribute(src,"title");
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
