package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email");
	    By pass = By.id("input-password");
		//8 locators id,name,classname,xpath,css selector,linktext,partial linktext,tagname
		//driver.findElement(By.id("input-email")).sendKeys("mana");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2 approach
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pass = driver.findElement(By.id("input-password"));
//		email.sendKeys("mana");
//		pass.sendKeys("test@123");
		
		
		//3.approach
//		WebElement emailid = driver.findElement(email);
//	    WebElement password = driver.findElement(pass);
//	    emailid.sendKeys("mana");
//	    password.sendKeys("test@123");
		
		//4.approach
	    
	   // doSendKeys(email,"manasa");
	    //doSendKeys(pass, "hai");
	    //5.approach
	    ElementUtil u = new ElementUtil(driver);
	    u.doSendKeys(email, "manasa");
	    u.doSendKeys(pass, "test@123");

	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void doSendKeys(By locator,String value) {
//		getElement(locator).sendKeys(value);
//	}

}
