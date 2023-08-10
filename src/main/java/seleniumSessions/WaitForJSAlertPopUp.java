package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		    driver = new ChromeDriver();
		    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		    Alert alert = waitForAlertPresent(10);
		  
		   
		    
	}
	public static Alert waitForAlertPresent(int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		   return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeout) {
		return waitForAlertPresent(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		waitForAlertPresent(timeout).accept();
	}
	public static void dismissAlert(int timeout) {
		waitForAlertPresent(timeout).dismiss();
	}
	public static void alertSendkeys(int timeout,String value) {
		waitForAlertPresent(timeout).sendKeys(value);
	}

}
