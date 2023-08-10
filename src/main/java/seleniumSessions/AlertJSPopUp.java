package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUp {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		//no alert present exception
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		if(s.contains("JS Alert")) {
			alert.accept();
		}
		//js alert - alert,prompt,confirm
		//auth popup
		//browser window popup
		//file upload popup
		
		

	}
}
