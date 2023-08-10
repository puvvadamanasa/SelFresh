package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketEx {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By loc = By.xpath("//a[contains(text(),'Shop by')]");
		selectProduct(loc,"Beverages","Tea","Tea Bags");
		
	}
	public static void selectProduct(By locator,String l2,String l3,String l4) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(locator);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(By.linkText(l2));
		act.moveToElement(ele1).build().perform();
		Thread.sleep(2000);
		WebElement ele2 =driver.findElement(By.linkText(l3));
		act.moveToElement(ele2).build().perform();
		Thread.sleep(2000);
		WebElement ele3 =driver.findElement(By.linkText(l4));
		ele2.click();
		
	}
}
