package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaText {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		List<WebElement> p = driver.findElements(By.tagName("p"));
		for(WebElement e:p) {
			String text = e.getText();
			System.out.println(text);
		}
		

	}

}
