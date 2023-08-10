package seleniumSessions;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtils bu = new BrowserUtils();
		bu.initDriver("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = bu.getPageTitle();
		System.out.println("Open Cart Page Title: "+title);
		if(title.equals("Account Login")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = bu.getPageURL();
		System.out.println("Open Cart Page URL: "+url);
		if(url.contains("naveen")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		bu.quitBrowser();

	}

}
