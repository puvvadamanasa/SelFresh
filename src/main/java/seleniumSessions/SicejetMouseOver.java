package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SicejetMouseOver {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		act.build().perform();
		driver.findElement(By.xpath("//div[text()='Senior Citizen Discount']")).click();
	}

}
