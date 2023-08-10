package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//String parent = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parent = it.next();
		child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parent = it.next();
		child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parent = it.next();
		child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		
		
	}

}
