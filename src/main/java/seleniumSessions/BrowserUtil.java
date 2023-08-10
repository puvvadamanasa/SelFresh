package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	private WebDriver driver = null;
	/**
	 * 
	 * @param browserName
	 * @return This return the specific browser driver
	 */
	public WebDriver initDriver(String browserName) {
		if(browserName.toLowerCase().trim().equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.toLowerCase().trim().equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.toLowerCase().trim().equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass right browser name");
		}
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
		System.out.println("Title: "+title);
		return title;
	}
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		return url;
	}
	public void quitBrowser() {
		if(driver != null) {
			driver.quit();
		}
	}

}
