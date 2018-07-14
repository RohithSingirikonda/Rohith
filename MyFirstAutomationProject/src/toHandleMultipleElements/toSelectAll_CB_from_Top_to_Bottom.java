package toHandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class toSelectAll_CB_from_Top_to_Bottom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Rohith/Testing/demofour.html");
		
		List<WebElement> allChbox = driver.findElements(By.xpath("//label"));
		int count = allChbox.size();
		System.out.println("Total No. of Checkboxes are: "+count);
		
		
		//select all check boxes from top to bottom 
		for (int i = 0; i < count; i++) {
			
			WebElement chkbox = allChbox.get(i);
			chkbox.click();
			Thread.sleep(500);
		}
		
		
		//deselect all checkboxes from bottom to top 
		for (int i = count-1; i>=0; i--) {
			
			allChbox.get(i).click();
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
		
		
		//select all check boxes from bottom  to top
				for (int i = count-1; i>=0; i--) {
					
					WebElement chkbox = allChbox.get(i);
					chkbox.click();
					Thread.sleep(500);
				}
				
				
				//deselect all checkboxes from top to bottom 
				for (int i = 0; i<count ; i++) {
					
					allChbox.get(i).click();
					Thread.sleep(500);
				}
				
		RemoteWebDriver rd = (RemoteWebDriver) driver;
		rd.executeScript("alert('Closing...')");
		Thread.sleep(1000);		
		driver.close();
	}

}
