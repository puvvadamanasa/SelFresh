package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextField {

	public static WebDriver driver;
	public static void main(String[] args) {
//		driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		driver.findElement(By.id("pass")).sendKeys("hai");
//		//element not interactable exception
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		String text = driver.findElement(By.id("submitButton")).getAttribute("disabled");
		//element click intercepted exception
		System.out.println(text);
		
	}

}
