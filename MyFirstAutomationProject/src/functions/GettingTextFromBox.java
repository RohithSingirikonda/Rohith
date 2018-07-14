package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTextFromBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Rohith/Testing/demotwo.html");
		WebElement tv = driver.findElement(By.id("form1"));
		String PrintText = tv.getAttribute("text");
		System.out.println(PrintText);

	}

}
