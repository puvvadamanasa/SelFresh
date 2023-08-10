package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		waitForFrameandSwitchToIt(10,"main");
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		

	}
	public static void waitForFrameandSwitchToIt(int timeout,String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	public static void waitForFrameandSwitchToItByIndex(int timeout,int frameindex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}
	public static void waitForFrameandSwitchToItByframeElement(int timeout,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}
	public static void waitForFrameandSwitchToItByframelocator(int timeout,By loc) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loc));
	}


}
