package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@Test(enabled = false)
	public void titleTest() {
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "Google11");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}



}
