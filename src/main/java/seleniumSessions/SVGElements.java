package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SVGElements {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
	    By sub = By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='oregon']//*[name()='path']");
		//*[local-name()='svg' and @id='map-svg']
		By svgXpath = By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']");
		List<WebElement> l = driver.findElements(svgXpath);
		System.out.println(l.size());
		for(WebElement e:l) {
			String state = e.getAttribute("name");
			if(state.equals("Oregon")) {
				e.click();
				List<WebElement> l1 = driver.findElements(sub);
				System.out.println(l1.size());
				for(WebElement e1:l1) {
					String t = e1.getAttribute("name");
					System.out.println(t);
				}
				break;
			}
		}
		
		

	}

}
