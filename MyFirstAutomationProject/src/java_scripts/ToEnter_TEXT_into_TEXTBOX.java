package java_scripts;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToEnter_TEXT_into_TEXTBOX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Extracted Files\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		RemoteWebDriver rd = (RemoteWebDriver) driver;
		String s = "document.getElementById('comments_two').value = 'Welcome...'";
		Thread.sleep(1000);
		rd.executeScript(s);
	}

}
