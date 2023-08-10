package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0) {
				//System.out.println(driver.findElements(By.xpath("//td[text()='India']")).size());
				selectMultiple("United States");
			}
			WebElement ele = driver.findElement(By.linkText("Next"));
			  if(ele.getAttribute("class").contains("disabled")) {
				  System.out.println("Pagination is over");
				  break;
		  }
			  ele.click();	
		}
		//single selection
//		while(true) {
//			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0) {
//				selectCountry("Hong Kong");
//				System.out.println("hi");
//				break;
//			}
//			else {
//			  WebElement ele = driver.findElement(By.linkText("Next"));
//			  if(ele.getAttribute("class").contains("disabled")) {
//				  System.out.println("Pagination is over");
//				  break;
//			  }
//			  ele.click();		
//			}
//		}
	}
	public static void selectCountry(String country) {
		driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void selectMultiple(String country) {
		List<WebElement> l = driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e:l) {
			e.click();
		}
		
	}
}
