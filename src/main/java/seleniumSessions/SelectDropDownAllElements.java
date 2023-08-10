package seleniumSessions;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By country = By.id("Form_getForm_Country");
		
//		int size = getTotalDropDownOptions(country);
//		System.out.println(size);
//		if(getTotalDropDownOptions(country)-1 == 232) {
//			System.out.println();
//		}
//		if(getDropDownOptionsTextList(country).contains("Brazil")){
//			System.out.println("brazil is present");
//		}
//		if(getDropDownOptionsTextList(country).contains("India")){
//			System.out.println("India is present");
//		}
//		List<String> l = Arrays.asList("India","Brazil","Belgium");
//		if(getDropDownOptionsTextList(country).containsAll(l)) {
//			System.out.println("true");
//		}
		selectDropDownValue(country,"Brazil");
//		List<WebElement> options = select.getOptions();
//		System.out.println(options.size()-1);
//		for(WebElement e:options) {
//			String text = e.getText();
//			if(text.equals("Brazil")) {
//				e.click();
//				break;
//			}
//			//System.out.println(text);
//		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	public static int getTotalDropDownOptions(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<String> optionsVal = new ArrayList<String>();
		List<WebElement> options = getDropDownOptionsList(locator);
		for(WebElement e:options) {
			String text = e.getText();
			optionsVal.add(text);
		}
		return optionsVal;
	}
	public static void selectDropDownValue(By locator,String value) {
		List<WebElement> options = getDropDownOptionsList(locator);
		for(WebElement e:options) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
