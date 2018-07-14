package screenshot;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAddons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.profile", "default");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https//www.google.com");

	}

}
