package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
			driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Downloads\\IMG_5537 (1).png");
		     //<type = file> is manadatory
	

	}

}
