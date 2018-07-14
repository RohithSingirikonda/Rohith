package java_scripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class To_ScrollDown_Webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		RemoteWebDriver rd = (RemoteWebDriver) driver;
		String scroll = "window.scrollTo(0,document.body.scrollHeight)";
		rd.executeScript(scroll);
	}

}
