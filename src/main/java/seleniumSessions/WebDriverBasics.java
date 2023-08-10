package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String acttitle = driver.getTitle();
		System.out.println("Title: "+acttitle);
		if(acttitle.equals("Google")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = driver.getCurrentUrl();
		if(url.contains("google")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		System.out.println(url);
		driver.close();
	}

}
