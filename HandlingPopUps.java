package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		
		//Handling PopUps
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("div.margTop10:nth-child(6) > div:nth-child(1) > input:nth-child(1)")).click();
		
		Thread.sleep(5000);
		
		Alert alert =  driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if ( text.equals("Please enter a valid user name") ) {
			System.out.println("Correct Message Displayed");
		} else {
			System.out.println("Not Correct");
		}
		
		alert.accept(); //For clicking the ok
		
		//alert.dismiss();  For Dismissing
		
		Thread.sleep(5000);
		
		driver.quit(); */
		
		
		//Uploading the file
		driver.get("https://altoconvertwordtopdf.com/");
		//Only work when type = file
		driver.findElement(By.xpath("//*[@id=\"dropzoneInput-label\"]")).sendKeys("C:\\Users\\HP\\Desktop\\pricelist1.docx");
		
	}

}
