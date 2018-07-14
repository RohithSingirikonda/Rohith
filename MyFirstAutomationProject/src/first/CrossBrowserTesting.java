package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {

	public static WebDriver driver;
	public static String BrowserName;
	public static int browser; //browser
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for (browser = 1; browser <=3; browser++) {
			
			if (browser==1) {
				
				System.setProperty("webdriver.chrome.driver","C:/Softwares/Extracted Files/chromedriver_win32 new/chromedriver.exe");
				driver = new ChromeDriver();
				BrowserName = "Chrome Browser: ";
				
			} else if (browser==2) {

				System.setProperty("webdriver.gecko.driver","C:/Softwares/Extracted Files/geckodriver-v0.15.0-win32/geckodriver.exe");
				driver = new FirefoxDriver();
				BrowserName = "Firefox Browser: ";
			
			}else if (browser==3){
	
		
				System.setProperty("webdriver.ie.driver","C:/Softwares/Extracted Files/IEDriverServer_Win32_3.1.0/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer: ";
				
			} 	
		
			driver.get("https://www.google.com");
			String Title = driver.getTitle();
			if (Title.equals("Google")) {
				System.out.println(BrowserName+" - Google Page Launched - Passed");
			} else {

				System.out.println(BrowserName+" - Google Page Launched - Failed");
			}
			
			driver.close();
			
			
			
		}

	}

}
