package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By language = By.xpath("//div[@id='SIvCob']/a");
		By footer = By.xpath("//div[contains(@class,'KxwPGc')]//a");
		//List<String> l= m1(language);
		//System.out.println(l);
		//m2(language,"తెలుగు");
		m3(footer);
		

	}
	public static List<WebElement>  getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> m1(By locator) {
		List<String> lang = new ArrayList<String>();
		List<WebElement> l = getElements(locator);
		for(WebElement e:l) {
			String text = e.getText();
			lang.add(text);	
		}
		return lang;
		
	}
   public static void m2(By locator,String value) {
	   List<WebElement> l = getElements(locator);
	   for(WebElement e:l) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
   public static void m3(By locator) {
	   List<WebElement> l = getElements(locator);
	   for(WebElement e:l) {
			String text = e.getText();
			System.out.println(text);
		}
	   
   }

}
