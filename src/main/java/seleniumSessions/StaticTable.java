package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.findElement(By.id("customers"));
		int hcount = headerCount();
		int rowCount = rowCount();
		System.out.println("Clo Count: "+hcount);
		System.out.println("RowCount: "+rowCount);
		getDataByColNum(2);
		

	}
	public static int headerCount() {
		List<WebElement> l = driver.findElements(By.xpath("//table[@id='customers']//th"));
		return l.size();
	}
	public static int rowCount() {
		List<WebElement> l = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		return l.size();
	}
	public static void getDataByColNum(int colnum) {
		String beforexpath ="//table[@id=\"customers\"]/tbody/tr[";
	    String afterXpath = "]/td["+colnum+"]";
	    	for(int row=2;row<=rowCount();row++) {
	    		String xpath = beforexpath+row+afterXpath;
	    		String text = driver.findElement(By.xpath(xpath)).getText();  
	    		System.out.println(text);
	    }
		
	}

}
