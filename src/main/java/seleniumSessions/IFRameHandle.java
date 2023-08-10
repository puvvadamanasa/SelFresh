package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRameHandle {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Vehicle Registration Form']")).click();
		driver.switchTo().frame("frame-one748593425");
		//iframe[contains(@id,'frame-one')]
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("sdf");
		driver.switchTo().defaultContent();
		
	}

}
