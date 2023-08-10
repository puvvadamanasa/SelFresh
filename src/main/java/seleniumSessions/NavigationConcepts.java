package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

}
}