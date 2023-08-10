package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Content')]"));
		Actions action = new Actions(driver);
		action.moveToElement(menu);
		action.build().perform();
		driver.findElement(By.linkText("COURSES")).click();
		
		

	}

}
