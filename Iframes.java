package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("file:///F:/Java%20again/sel/src/SeleniumSessions/test1.html");
		
		driver.switchTo().frame("iframe_a");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click(); //created Xpath customized not copied from inspect
		

	}

}
