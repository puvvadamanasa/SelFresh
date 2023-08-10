package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		String url = driver.getCurrentUrl();
		System.out.println(url);	
		if(url.contains("google")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String ps = driver.getPageSource();
		System.out.println(ps);
		if(ps.contains("querySelector")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		driver.quit();
	}
}
