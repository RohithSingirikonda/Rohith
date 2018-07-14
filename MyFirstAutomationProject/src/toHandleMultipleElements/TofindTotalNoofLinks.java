package toHandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindTotalNoofLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demofour.html");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count  = allLinks.size();
		System.out.println("Total number of Links are: "+count);
		WebElement links = allLinks.get(3);
		String text = links.getText();
		System.out.println("Text of a Link is: "+text);
		
	}

}
