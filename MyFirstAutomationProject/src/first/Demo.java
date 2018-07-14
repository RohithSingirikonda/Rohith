package first;

import org.openqa.selenium.Dimension; import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo

{

public static void main(String[] args) throws InterruptedException

{

//Open the browser
	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
	WebDriver cd=new ChromeDriver(); 
	cd.get("file://D:/Rohith/tables.html"); Thread.sleep(2000);

	//System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Extracted Files\\geckodriver-v0.15.0-win32\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver(); driver.get("file://D:/Rohith/tables.html"); Thread.sleep(2000);
	
//Resize the browser

Dimension d=new Dimension(200, 200); 
cd.manage().window().setSize(d);
Thread.sleep(2000);

//Move the browser

Point p=new Point(300, 200); 
cd.manage().window().setPosition(p); 
Thread.sleep(2000);

cd.manage().window().maximize();
Thread.sleep(2000);

cd.quit();

//Maximize the browser f.manage().window().maximize();

}

}