package first;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RuntimeMultipleBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter browser?GC/FF/IE"); 
		String browser=sc.next();

		WebDriver driver;

		if(browser.equals("GC")||browser.equals("gc"))

		{

		System.setProperty("webdriver.chrome.driver","C:/Softwares/Extracted Files/chromedriver_win32 new/chromedriver.exe");

		driver=new ChromeDriver();

		}

		else if(browser.equals("IE")||browser.equals("ie"))

		{

	System.setProperty("webdriver.ie.driver","C:/Softwares/Extracted Files/IEDriverServer_Win32_3.1.0/IEDriverServer.exe");

		driver=new InternetExplorerDriver();

		}

		else

		{
		
		System.setProperty("webdriver.gecko.driver","C:/Softwares/Extracted Files/geckodriver-v0.15.0-win32/geckodriver.exe");

		driver=new FirefoxDriver();

		}
		
		driver.get("http://www.google.com"); 
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();



	}

}
