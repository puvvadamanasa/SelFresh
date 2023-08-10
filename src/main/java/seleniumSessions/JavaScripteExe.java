package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripteExe {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://amazon.in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		js.executeScript("alert('hi this is alert');");

	}

}
