package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("https://www.facebook.com/");
		
		/*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("cpranav16@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("my10CARS");
		driver.findElement(By.linkText("Log In")).click();*/
		
		//For Select class
		
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("4");

	}

}
