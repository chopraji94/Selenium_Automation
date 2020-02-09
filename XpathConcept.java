package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//Xpath as Locator -- Don't use heirarchy base xpath
		
		/*driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Pranav");*/
		
		//ID as  Locator
		
		/*driver.findElement(By.id("identifierId")).sendKeys("Pranav Chopra");
		
		 */
		
		//Name As Locator
		
		/*driver.findElement(By.name("identifier")).sendKeys("chopraji94@gmail.com");;
		
		driver.quit();*/
		
		//Link as Locator
		
		/*driver.findElement(By.linkText("Help")).click();*/
		
		//CSS Selector
		
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("chopraji94@gmail.com");
	
		//ClassName as Locator
		
		driver.findElement(By.className("RveJvd snByac")).click();
	}

}
