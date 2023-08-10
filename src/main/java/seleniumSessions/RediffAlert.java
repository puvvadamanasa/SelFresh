package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlert {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("manasa");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	    if(text.contains("valid user name")) {
		 alert.accept();
		}
		
		
//		driver.findElement(By.id("login1")).sendKeys("manasa");
//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if(text.contains("enter your password")) {
//		 alert.accept();
//		}
		
//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if(text.contains("valid user name")) {
//			alert.accept();
//		}
//		

	}

}
