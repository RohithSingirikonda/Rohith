package toHandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindTotalNoofCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demofour.html");
		
		List<WebElement> chbxs= driver.findElements(By.xpath("//label"));
		int count = chbxs.size();
		System.out.println("Total Number of check boxes are: "+count);
		
		
		//To find text of Check Boxes
		System.out.println("\n\nText of Check Boxes are: \n");
		for (WebElement value:chbxs) {
			
			System.out.println(value.getText());
		}

		driver.close();
		
		
	}

}
