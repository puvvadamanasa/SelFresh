package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	private WebDriver driver = null;
	
	public WebDriver initDriver(String browserName) {
		if(browserName.trim().toLowerCase().equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.trim().toLowerCase().equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.trim().toLowerCase().equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass right browserName");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	public void launchURL(String url) {
		if(url == null) {
			System.out.println("url cannot be null");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		return title;
	}
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page URL: "+url);
		return url;
	}
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
