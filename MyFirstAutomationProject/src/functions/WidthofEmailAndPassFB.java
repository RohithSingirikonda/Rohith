package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthofEmailAndPassFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		Dimension d1 = email.getSize();
		int w1 = d1.getWidth();
		System.out.println("Width of Email Field: "+w1);

		WebElement pass=driver.findElement(By.id("pass"));
		Dimension d2 = pass.getSize();
		int w2 = d2.getWidth();
		System.out.println("Width of Email Field: "+w2);

		if (w1==w2) {
			
			System.out.println("Width is same");
		}
		else {
			System.out.println("Width is different");
		}
		
		
		
		
		
		WebElement fname=driver.findElement(By.id("u_0_r"));
		Dimension d3 = fname.getSize();
		int w3 = d3.getWidth();
		System.out.println("Width of FName Field: "+w3);

		WebElement Remail=driver.findElement(By.id("u_0_w"));
		Dimension d4 = Remail.getSize();
		int w4 = d4.getWidth();
		System.out.println("Width of Registration Email Field: "+w4);

		if (w3==w4) {
			
			System.out.println("Width is same");
		}
		else {
			System.out.println("Width is different");
		}
		
		
		
	}

}
