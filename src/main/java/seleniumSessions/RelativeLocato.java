package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocato {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Grande Prairie, Canada"));
		String s = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(s);
		String s1 =driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(s1);
		
		String s2 =driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(s2);
		String s3 = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(s3);
		String s4 = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(s4);
		

	}

}
