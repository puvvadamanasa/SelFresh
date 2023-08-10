package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	public static void main(String[] args) {
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		
		BrowserUtils b = new BrowserUtils();
		WebDriver driver =  b.initDriver("chrome");
		ElementUtil e = new ElementUtil(driver);
		b.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = b.getPageTitle();
		System.out.println("Page Title: "+title);
		
		e.doSendKeys(fname, "manasa");
		e.doSendKeys(lname, "puvvada");
		e.doSendKeys(email, "manasapuvvada1993@gmail.com");
		e.doSendKeys(telephone, "8978946841");
		e.doSendKeys(pwd, "test@123");
		e.doSendKeys(cpwd, "test@123");
		//b.quitBrowser();
	}

}
