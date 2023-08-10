package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//input#input-email
		//#input-email
		//input.form-control
		//.form-control
		//input.login-email
		//.login-email
		//input.form-control.private-form__control.login-email
		//.form-control.private-form__control.login-email
		//button.private-button__link 
		//.private-button__link
		//button.login-submit
		//.login-submit
		//input.form-control.login-email
		//input.form-control.login-email#username
		//input#username.login-email
		//#username.login-email
		//.login-email#username
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		//input[type='submit']
		//input[placeholder='E-Mail Address']
		//input[id='input-email']
		//input[class='form-control private-form__control login-email']
		//input[class='private-form__control login-email']//invalid
		//input[type='text'][placeholder='First Name']
		//input[type='text'][placeholder='First Name'][placeholder='First Name']
		//input[type='text']#input-firstname
		//text is not there in css
		//contains in css
		//input[id*=firstname]
		//input[class*=login-email]
		//starts-with ends-with
		
		//input[placeholder^=First]
		//input[placeholder$=Name]
		//input[placeholder$=Name]
		
		//parent to child
		//> direct
		//parent child direct+indirect
		//div.private-form__input-wrapper  input
		//form#Form_getForm select
		//form#hs-login  div
		//form#hs-login  > div
		//child to parent not possible
		//input[type='text'][id='input-email'] and in css
		//or means comma , in css
		//input#username,button#loginBtninput#password
		List<WebElement> l = driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password"));
		System.out.println(l.size());
		//img[title='naveenopencart'],input[name='search'],button[data-toggle='dropdown']
		//input#input-firstname,input[type='checkbox']
		//not in css
		//input.form-control.private-form__control:not(#password)
		//input.form-control.private-form__control:not(input[id='password'])
		//input.form-control:not(input[name='search'])
		//indexing in css
		//select#Form_getForm_Country>option:first-child
		//select#Form_getForm_Country>option:last-child
		//select#Form_getForm_Country>option:nth-of-type(6)
		//ul.gkmXaP >li:nth-of-type(2)
		//ul.gkmXaP >li:first-child
		//following-sibling in css
		//label[for='username']+input
		//~ forward sibling
		//label[for='username']~div
		
	}

}
