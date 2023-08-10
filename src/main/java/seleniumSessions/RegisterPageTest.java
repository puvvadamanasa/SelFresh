package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By cpassword = By.id("input-confirm");
		By agree = By.name("agree");
		By btn = By.className("btn-primary");
		By msg = By.tagName("h1");
		BrowserUtils b = new BrowserUtils();
		driver = b.initDriver("chrome");
		b.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = b.getPageTitle();
		System.out.println("Page Title: "+title);
		String url = b.getPageURL();
		System.out.println("Page URL: "+url);
		ElementUtil util = new ElementUtil(driver);
		util.doSendKeys(fname, "manasa");
		util.doSendKeys(lname, "puvvada");
		util.doSendKeys(email, "puvvadamanasa0@gmail.com");
		util.doSendKeys(telephone, "8978946842");
		util.doSendKeys(password, "test@123");
		util.doSendKeys(cpassword, "test@123");
		util.doClick(agree);
		util.doClick(btn);
		String message = util.doElementGetText(msg);
		System.out.println(message);
		if(message.contains("Your Account Has Been Created")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
	}

}
