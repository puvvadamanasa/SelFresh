package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMPracticeFrames {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("HOME")).click();
		driver.findElement(By.linkText("CALENDAR")).click();
		driver.findElement(By.linkText("COMPANIES")).click();
		driver.findElement(By.linkText("CONTACTS")).click();
		driver.findElement(By.linkText("DEALS")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.linkText("CASES")).click();
		driver.findElement(By.linkText("CALL")).click();
		driver.findElement(By.linkText("EMAIL")).click();
		driver.findElement(By.linkText("TEXT/SMS")).click();
		driver.findElement(By.linkText("PRINT")).click();
		driver.findElement(By.linkText("CAMPAIGNS")).click();
		driver.findElement(By.linkText("DOCS")).click();
		driver.findElement(By.linkText("FORMS")).click();
		driver.findElement(By.linkText("REPORTS")).click();
		
	}
}
