package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown_and_Up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver() ;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
	}

}
