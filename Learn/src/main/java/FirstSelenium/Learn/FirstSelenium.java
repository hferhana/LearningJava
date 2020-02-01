package FirstSelenium.Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanzina\\eclipse-workspace\\FirstSelenium\\Learn\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.quit();
	
	}

}
