package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("title: "+title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		//driver.close();//invalid session id NoSuchSessionException
		System.out.println(driver.getTitle());
		
	}

}
