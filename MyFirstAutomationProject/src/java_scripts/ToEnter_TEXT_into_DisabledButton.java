package java_scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToEnter_TEXT_into_DisabledButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Not working fine
		
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		RemoteWebDriver rd = (RemoteWebDriver) driver ;
		Thread.sleep(1000);
		String s = "document.getElementById('comments').value='New Click me !'";
		rd.executeScript(s);
	}

}

