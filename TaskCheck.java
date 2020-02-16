package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TaskCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("https://www.hdfc.com/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Title of Parent window is -: " + driver.getTitle());;
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("For Home Loans")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Customer Login")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));*/
		
		Thread.sleep(5000);
		
		Set<String> winHandles = driver.getWindowHandles();
		
		int count = winHandles.size();
		
		System.out.println("Size is -: " + count);
		
		for ( String handle:winHandles ) {
			if ( !parentWindow.equalsIgnoreCase(handle) ) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.linkText("User ID")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#loginForm > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("chopraji94");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#password")).sendKeys("password");
				break;
			}
		}
	}

}
