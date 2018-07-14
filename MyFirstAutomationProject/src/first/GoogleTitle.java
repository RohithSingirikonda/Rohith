package first;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("Passed: Google is the Title ");
		}
		else
		{
			System.out.println("Fail: Title is not Google: actual title is "+ "'"+title+"'");
		}
		
		String url = driver.getCurrentUrl();
		if(url.contains("google.com"))
		{
			System.out.println("Pass URL is correct");
		}
		else
		{
			System.out.println("Fail: URl is Wrong  "+"'"+url+"'");
			
		}
		
	}

}
