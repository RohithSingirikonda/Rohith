package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTextBoxEmptyFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		String s = email.getAttribute("value");
		
		if (s.length()==0) {
			System.out.println("Text Box is Empty");
		}
		else {
			System.out.println("Text Box is Not Empty");
		}
		
		
	}

}
