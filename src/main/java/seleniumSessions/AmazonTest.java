package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil bu = new BrowserUtil();
		bu.initDriver("chrome");
		bu.launchURL("https://www.amazon.com");
		String title = bu.getPageTitle();
		System.out.println("Amazon title: "+title);
		if(title.contains("Amazon")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		String url = bu.getPageURL();
		if(url.contains("amazon")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		System.out.println("Page URL: "+url);
		bu.quitBrowser();
	}
}
