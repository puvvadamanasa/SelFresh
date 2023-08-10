package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandles {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String t = driver.findElement(By.tagName("h2")).getText();
		System.out.println(t);
		driver.switchTo().defaultContent();
		//total frames //frame
		
		

	}

}
