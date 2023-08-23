package fbpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Software Testing\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
	}

}
