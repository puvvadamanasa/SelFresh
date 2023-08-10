package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWHandles {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parent = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String handle = it.next();
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			if(!handle.equals(parent)) {
				driver.close();
			}
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			
		}
	}
	
}
