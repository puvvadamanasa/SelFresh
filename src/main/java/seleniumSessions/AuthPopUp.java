package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		String un = "admin";
		String pwd = "admin";
		driver.get("https://"+un+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");	
	}
}
