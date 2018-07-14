package facebookoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_text_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		WebElement t1 = driver.findElement(By.xpath("//value[@id=pageFooter]/../ul/li[1]/a"));
		String text = t1.getText();
		System.out.println("The Text of Link of Facebook Page"+text);
		

	}

}
