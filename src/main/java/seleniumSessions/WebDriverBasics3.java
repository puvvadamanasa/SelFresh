package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = null;
		String browserName = "chrome";
		switch(browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass right browserName");
		}
		driver.get("https://facebook.com");
		String title = driver.getTitle();
		System.out.println("title: "+title);
		if(title.contains("Facebook")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println("url: "+url);
		if(url.contains("facebook")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		driver.close();
	}

}
