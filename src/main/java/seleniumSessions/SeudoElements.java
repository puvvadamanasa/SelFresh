package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeudoElements {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		String mand = js.executeScript(script).toString();
		System.out.println(mand);
		if(mand.contains("*")) {
			System.out.println("this is a mand field");
		}
		

	}

}
