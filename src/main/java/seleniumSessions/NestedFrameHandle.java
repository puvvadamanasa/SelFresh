package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(2000);
		driver.switchTo().frame("pact2");//we canot directly move to frame 2
		driver.findElement(By.id("jex")).sendKeys("hkj");
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("abc");
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("hkj");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("new");
//		driver.switchTo().frame("pact2");
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("iop");
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("manasa");
//		driver.switchTo().defaultContent();
		
	}

}
