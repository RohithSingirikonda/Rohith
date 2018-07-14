package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextOfLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement v1=driver.findElement(By.xpath("//input[@id='persist_box']/../../../../td[2]/a" ));
		String text = v1.getText();
		System.out.println(text);
		

	}

}
