package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtils {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		JavaScriptUtil j = new JavaScriptUtil(driver);
		driver.manage().window().maximize();
		//j.generateAlert("Hi this is alert");
		//j.generateConfirmPopUp("Hi a u sure u want to delete?");
		//String s = j.getPageInnerText();
		//System.out.println(s);
		//j.refreshBrowserByJS();
		//j.drawBorder(driver.findElement(By.id("input-firstname")));
		//j.sendKeysUsingWithId("input-firstname", "manasa");
		//j.flash(driver.findElement(By.id("input-firstname")));
//		j.scrollPageDown();
//		Thread.sleep(2000);
//		j.scrollPageUp();
//		Thread.sleep(2000);
//		j.scrollPageDown();
//		Thread.sleep(2000);
//		j.scrollPageUp();
//		Thread.sleep(2000);
//		j.scrollPageDownMiddlepage();
		WebElement ele =  driver.findElement(By.xpath("//span[text()='Frequently repurchased in Home']"));
		j.scrollIntoView(ele);
		
	}

}
