package qspiders;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("file://D:/Rohith/tables.html"); 
		Thread.sleep(2000);
		

Dimension d=new Dimension(200, 200); 
driver.manage().window().setSize(d);
Thread.sleep(2000);

//Move the browser

Point p=new Point(300, 200); 
driver.manage().window().setPosition(p); 
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

driver.quit();

		

	}

}
