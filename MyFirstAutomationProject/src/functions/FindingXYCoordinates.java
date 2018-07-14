package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingXYCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement we=driver.findElement(By.id("email"));
		Point p = we.getLocation();
		System.out.println("X location of email field is: "+p.getX());
		System.out.println("Y location of email field is: "+p.getY());
		
		driver.manage().window().maximize();
		
		WebElement em = driver.findElement(By.id("day"));
		Point pp = em.getLocation();
		System.out.println("X location of day field is: "+pp.getX());
		System.out.println("Y location of day field is: "+pp.getY());
		
		

		WebElement aa = driver.findElement(By.id("u_0_12"));
		Point po = aa.getLocation();
		System.out.println("X location of signup field is: "+po.getX());
		System.out.println("Y location of signup field is: "+po.getY());
		
		
	}

}
