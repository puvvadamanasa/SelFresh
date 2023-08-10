package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("input-email11")).sendKeys("manasa");
		driver.findElement(By.id("input-password")).sendKeys("manasa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//static wait
		//Thread.sleep(2000);
		//dynamic wait
		//implicit wait
		//explicit wait
		//webdriver wait(c) fluentwait(c) wait(I) until 
	}

}
