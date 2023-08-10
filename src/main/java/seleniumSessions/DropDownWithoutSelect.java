package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		getDropDownOptions(country,"India");
//		List<WebElement> opt = driver.findElements(country);
//		System.out.println(opt.size());
//		for(WebElement e:opt) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getDropDownOptions(By locator,String value) {
		List<WebElement> opt = getElements(locator);
		for(WebElement e:opt) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
