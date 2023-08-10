package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement ele = driver.findElement(By.id("draggable"));
		WebElement targ = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(ele).moveToElement(targ).release().build().perform();
		//act.dragAndDrop(ele, targ).build().perform();
		
	}

}
