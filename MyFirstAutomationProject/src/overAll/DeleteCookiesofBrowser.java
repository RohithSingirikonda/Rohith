package overAll;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookiesofBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		System.out.println("Cookies Deleted Successfully");
		
		driver.close();
		

	}

}
