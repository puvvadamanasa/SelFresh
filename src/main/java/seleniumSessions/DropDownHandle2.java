package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		//Select select = new Select(driver.findElement(country));
		List<WebElement> l = driver.findElements(country);
		System.out.println(l.size());
		for(WebElement e:l) {
			String text = e.getText();
			System.out.println(text);
		}
			
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void DropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void DropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void DropDownByText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static int getTotalDropDownOptions(By locator) {
		return getDropDownOptionsList(locator).size();	
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	public static List<String> getTotalDropDownOptionsText(By locator) {
		List<String> optionsVal = new ArrayList<String>();
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for(WebElement e:optionsList) {
			String text = e.getText();
			optionsVal.add(text);
		}
		return optionsVal;
	}
	public static void selectDropDownValue(By locator,String value) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for(WebElement e:optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}	
		}		
	}
}
