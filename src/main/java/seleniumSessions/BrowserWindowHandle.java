package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it = handles.iterator();
		String pwid = it.next();
		String cwid = it.next();
		System.out.println(pwid);
		System.out.println(cwid);
		driver.switchTo().window(cwid);
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
