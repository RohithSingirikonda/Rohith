package overAll;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckPageLoadTime {

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		System.out.println("Page Opened in 5 Seconds");
		
		//Thread.sleep(500);
		//driver.get("http://www.facebook.com");
		//System.out.println("Facebook Opened in 10 Seconds");
		
		

	}

}
