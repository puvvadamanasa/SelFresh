
package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		//find all links on page
		//find total links count
		//find text of each link
		 List<WebElement> list  =driver.findElements(By.tagName("a"));
		 int actcount = list.size();
		 System.out.println(list.size());
		 int tc,index = 0;
		 for(WebElement e:list) {
			 String text = e.getText();
			 if(text.length()>0) {
				 System.out.println(index+" :  "+text);
			 }
			 index++;
		 }
//		 for(int i=0;i<list.size();i++) {
//			 String text = list.get(i).getText();
//			 if(text.length()>0) {
//			     System.out.println(i+"  :  "+text);
//			     tc=tc+1;
//			 }
//		 }
//		 System.out.println(tc);
//		 int bcount = actcount-tc;
//		 System.out.println(bcount);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> list = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String text = e.getText();
			list.add(text);
		}
		return list;
	}

}
