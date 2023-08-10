package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele =  driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		//act.contextClick();
		act.contextClick(ele);
		act.build().perform();
		 List<WebElement> l =driver.findElements(By.cssSelector("ul.context-menu-root span"));
		 System.out.println(l.size());
		 for(WebElement e:l) {
			 String text = e.getText();
			 if(text.equals("Copy")) {
				 e.click();
				 break;
			 }
		 }
	}

}
