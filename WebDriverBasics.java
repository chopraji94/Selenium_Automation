package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Firefox Driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if ( title.equals("Google") ) {
			System.out.println("Correct");
		} else {
			System.out.println("Not Correct");
		}
		
		driver.quit();
		
		//Launch Chrome Driver
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");*/

	}

}
