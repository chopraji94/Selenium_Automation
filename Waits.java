package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //For the page to completely load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //For the page elements to completely load
		
		

	}

}
