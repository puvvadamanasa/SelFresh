package seleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick2 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(ele);
		act.build().perform();
		List<WebElement> l = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			l.get(i).click();
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			alert.accept();
			act.contextClick(ele).build().perform();
		}

	}

}
