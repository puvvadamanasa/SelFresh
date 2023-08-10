package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("start db");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("Before Test--create User");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Lauch browser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM-- Login intoApp");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("Home PageTITle Test");
	}
	@Test
	public void homePageURLTest() {
		System.out.println("Home PageURL Test");
	}
	@Test
	public void homePageSearchTest() {
		System.out.println("Home serach Test");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("delete User");
	}
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("close db");
	}

}
