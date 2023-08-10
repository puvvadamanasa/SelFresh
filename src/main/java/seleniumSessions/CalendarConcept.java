package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		selectFutureDate("October 2023","24");
		//selectDate("24");
		//selectCalDate("24");
	}
	public static void selectFutureDate(String expMonthYear,String day) {
		if(Integer.parseInt(day)>31) {
			System.out.println("Wrong day passed");
			return;
		}
		String actMont = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMont);
		while(!actMont.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.linkText("Next")).click();
			actMont = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		selectDate(day);
	}
	public static void selectCalDate(String day) {
		List<WebElement> daysList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		for(WebElement e:daysList) {
			String text = e.getText();
			if(text.equals(day)) {
				e.click();
				break;
			}
		}
		
	}
	public static void selectDate(String date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
}
