package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
	static WebDriver driver;
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
