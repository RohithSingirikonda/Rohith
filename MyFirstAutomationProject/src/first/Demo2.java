package first;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Extracted Files\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		FirefoxDriver driver=new FirefoxDriver(); Thread.sleep(2000); 
		driver.get("http://www.google.com"); Thread.sleep(2000); 
		driver.navigate().to("http://www.gmail.com"); Thread.sleep(2000);

		driver.navigate().back(); Thread.sleep(2000); 
		driver.navigate().forward(); Thread.sleep(2000);
		driver.navigate().back(); Thread.sleep(2000); 
		driver.navigate().refresh(); Thread.sleep(2000); 
		driver.quit();

	}

}
