package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavaScriptUtil js = new JavaScriptUtil(driver);
		//js.scrollIntoView(driver.findElement(By.xpath("//span[text()='Frequently repurchased in Home']")));
		js.clickElementByJS(driver.findElement(By.linkText("Registry")));
		//click ui click on middle of elemen
		//actions click move to element and click on middle of the element
		//js click click from DOM
	}

}
