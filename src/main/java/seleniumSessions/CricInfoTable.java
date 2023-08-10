package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/pakistan-in-sri-lanka-2023-1385664/sri-lanka-vs-pakistan-2nd-test-1385686/full-scorecard");
		Thread.sleep(2000);
		getBowler("Sadeera Samarawickrama");
		 List<String> l = getScoreCard("Ramesh Mendis");
		 System.out.println(l);
		
	}
	public static void getBowler(String playerName) {
		String wk = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td/span/span")).getText();
		System.out.println("Wicket Keeper: "+wk);

	}
	public static List<String> getScoreCard(String playerName) {
		List<String> sclist = new ArrayList<String>();
		List<WebElement> l = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		for(WebElement e:l) {
			String text = e.getText();
			sclist.add(text);
		}
		return sclist;
	}

}
