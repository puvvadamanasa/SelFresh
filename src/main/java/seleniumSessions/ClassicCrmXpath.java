package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCrmXpath {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
		selectUser("Bima P");
		getUserCompanyName("Ali khan");
		getPhoneNumber("Ali khan");
		getHomePhoneNumber("Ali khan");
		getMobileNumber("Ali khan");
		getEmailId("Ali khan");
		
		//By cb = By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		
		

	}
	public static void selectUser(String username) {
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void getUserCompanyName(String username) {
		String cn = driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
		System.out.println("Comapny name: "+cn);
	}
	public static void getPhoneNumber(String username) {
		String pn = driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[2]/span")).getText();
		System.out.println("Phone Number: "+pn);
	}
	public static void getHomePhoneNumber(String username) {
		String hpn = driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[3]/span")).getText();
		System.out.println("Home Phone Number: "+hpn);
	}
	public static void getMobileNumber(String username) {
		String mobile = driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[4]/span")).getText();
		System.out.println("Mobile Number: "+mobile);
	}
	public static void getEmailId(String username) {
		String email = driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[last()-1]/a")).getText();
		System.out.println("EMAIl Id: "+email);
	}

}
