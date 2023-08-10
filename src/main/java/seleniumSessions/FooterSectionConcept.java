package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<String> l = getSectionList("Extras");
		System.out.println(l);
		List<String> l1 = getSectionList("Information");
		System.out.println(l1);
	}
	public static List<String> getSectionList(String sectionName) {
		List<String> list = new ArrayList<String>();
		List<WebElement> l = driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		for(WebElement e:l) {
			String text = e.getText();
			list.add(text);
		}
		return list;
	}

}
