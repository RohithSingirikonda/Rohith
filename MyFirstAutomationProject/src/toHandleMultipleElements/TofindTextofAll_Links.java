package toHandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindTextofAll_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demofour.html");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Text of all Links are: ");
		
		for (int i = 0; i <allLinks.size() ; i++) {
			
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		
		
		//Alternative Function
		System.out.println("\n\nThis is Alternative method\n");
		for (WebElement link:allLinks) {
			
			System.out.println(link.getText());
		}


		
		driver.close();

	}

}
