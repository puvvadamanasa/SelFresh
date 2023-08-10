package seleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTest {
	public static void main(String[] args) {
		SearchContext sc = new ChromeDriver();//valid not recommende
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver dc = new ChromeDriver();//valid
		ChromiumDriver cd = new ChromeDriver();//valid
		ChromeDriver dri = new ChromeDriver();//browser specific
		SearchContext st = new RemoteWebDriver(null);//valid not recommensed
		RemoteWebDriver rd = new FirefoxDriver();//valid
		
		
		
	
		
		
	}

}
