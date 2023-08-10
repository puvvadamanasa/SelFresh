package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("slider"));
		ele.click();
		int width = ele.getSize().getWidth();
		System.out.println(width);//1264
		
		Actions act = new Actions(driver);
		act.moveToElement(ele, -((width/2)-30), 0).click().build().perform();
		
		

	}

}
