package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		//static wait
		//dynamic wait
		   //implicit wait is apllicable only for webElements
		   //explicit wait webelements alerts url tiile
		     //webdriver wait 
		     //fluent wait
		//wait(i)->fluent wait->webdriver wait until
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Forgotten Password")).click();
		String title = waitForTitleContains(10,"Password");
		String title1 = waitForTitleIsandFetch(10,"Forgot Your Password?");
		if(title.contains("Password")) {
			System.out.println("test pass");
		}
		System.out.println(title1);
		driver.navigate().to("https://amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
		String url = waitForURLContainsandFetch(10,"mobile");
		System.out.println(url);
		boolean b = waitForURLContains(10,"mobile");
		System.out.println(b);
		

	}
	public static String waitForTitleContains(int timeout,String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleContains(titleFractionValue));
		 return driver.getTitle();
	}
	public static String waitForTitleIsandFetch(int timeout,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleIs(titleValue));
		 return driver.getTitle();
	}
	public static String waitForURLContainsandFetch(int timeout,String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.urlContains(urlFractionValue));
		 return driver.getCurrentUrl();
	}
	public static boolean waitForURLContains(int timeout,String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));
		 
	}

}
