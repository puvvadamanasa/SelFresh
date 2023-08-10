package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
    public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//id
		//name
		//classname
//		driver.findElement(By.name("email")).sendKeys("hai");
//		driver.findElement(By.name("password")).sendKeys("jkl");
//		By email = By.name("email");
//		By password = By.name("password");
		//className
		//driver.findElement(By.className("form-control")).sendKeys("hai");
		//xpath
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("hai");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("jk");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		doSendKeys(email, "hjk");
//		doSendKeys(pwd, "kjf");
//		doClick(login);
		//css selector
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("fd");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("dfg");
		//driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		//linktext
		//driver.findElement(By.linkText("Register")).click();
		//By reg = By.linkText("Register");
		//doClick(reg);
		//partialLinkText
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//tagname
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		By rp = By.linkText("Recurring payments");
		String r = doElementGetText(rp);
		System.out.println(r);
		//id name classname xpath css linktext partial linktext tagname
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
}
