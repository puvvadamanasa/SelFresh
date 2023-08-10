package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//absolute xpath relative xpath
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		//input[@type='text' and @id='input-email']
		//input
		//a
		//img
		//input[@id='input-email' or @type='text']
		//input[@type='text' and @name='search']
		//input[@type='email' or @type='text']
		//h2[text()='Returning Customer']
		//h2[text()='New Customer']
		//a[text()='My Account']
		//a[text()='Forgotten Password']
		//a[@href]
		List<WebElement> l = driver.findElements(By.xpath("//a[text()='My Account']"));
		System.out.println(l.size());
		//a[text()='Register' and @class='list-group-item' and @href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']
		//a[text()='Register' and @class='list-group-item']
		//h2[text()='Happy customers. Energized employees. That’s impact.' and @class='sc-4555ca6a-0 cSojqi']
		//h2[contains(text(),'Happy customers')]
		//a[contains(@href,'forgotten')]
		//input[contains(@placeholder,'Address')]
		//input[contains(@id,'email')]
		//h2[contains(text(),'New')]
		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		//input[contains(@placeholder,'E-Mail') and @id='input-email' and @type='text']
		//a[contains(text(),'Amazon')]
		//a[contains(text(),'Amazon') and contains(@href,'amazon.science')]
		//a[contains(text(),'Amazon') and @class='nav_a']
		//a[starts-with(text(),'Amazon')]
		//small[starts-with(text(),'Forms are')]
		//input[starts-with(@aria-labelledby,'UIFormControl') and @type='email']
		//a[starts-with(@href,'https://naveenautomationlabs.com/opencart')]
		//(//input[@class='form-control'])[2]
		//(//input[@class='form-control'])[position()=1]
		//(//input[@class='form-control'])[last()]
		//(//input[@class='form-control'])[last()-1]
		//(//input[@class='form-control'])[last()-2]
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		//class in locator
		//input[@class='form-control private-form__control login-email']//valid
		//input[@class='login-email'] this is wrong
		driver.findElement(By.className("form-control private-form__control login-email"));//not valid
		By.className("login-email");//valid
		By.xpath("//input[contains(@class,'login-email')]");
		//input[@name='email']
		//div[@class='private-form__input-wrapper']/input
		//footer//a
		//parent to child /direct
		//parent to child //direct+indirect
		//child to parent
		//input[@id='input-email']/..  child to parent
		//input[@id='input-email']/../../../../../..
		//input[@id='input-email']/parent::div
		//input[@id='input-email']/preceding-sibling::label
		//label[text()='E-Mail Address']/following-sibling::input[@name='email']
		//a[contains(text(),'Ali khan')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Chicago Bruner']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//(//a[text()='deepti gupta']/parent::td/following-sibling::td)[position()=1]/a
		//a[text()='deepti gupta']/parent::td/following-sibling::td/span
		//*[@id and @class]
		//*
		//img[@id and @class]
		//*[@id='input-firstname']
		//input[@id='input-firstname']
		//h5[text()='Information']/following-sibling::ul//a
		
		
	}
}
