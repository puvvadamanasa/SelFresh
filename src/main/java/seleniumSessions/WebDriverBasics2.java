package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		String browserName = "edge";
		WebDriver driver = null;
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass right browserName");
		}
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}

	}

}
