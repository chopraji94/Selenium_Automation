package SeleniumSessions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\gekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		boolean flag = false;
		
		driver.get("file:///F:/Java%20again/sel/src/SeleniumSessions/tables.html");
		
		WebElement myTable= driver.findElement(By.xpath("/html/body/table"));
		
		List<WebElement> row = myTable.findElements(By.tagName("tr"));
		
		int row_count = row.size();
		
		for ( int rowSt = 0; rowSt < row_count ; rowSt++ ) {
			String rowText = row.get(rowSt).getText();
			System.out.println("Row is -: " + rowText);
			
			if ( rowText.contains("Germany") ) {
				flag = true;
				System.out.println("got");
			}
			
			List<WebElement> Column_row = row.get(rowSt).findElements(By.tagName("td"));
			
			for (int columnSt = 0 ; columnSt < Column_row.size() ; columnSt++ ) {
				
				String cellText = Column_row.get(columnSt).getText();
				System.out.println("Column is -: " + cellText);
				
				if ( flag ) {
					String ansText = Column_row.get(1).getText();
					System.out.println("The prefered value is -: " + ansText );
					break;
				}
			}
			
			System.out.println("-------------------------------------");
			
		}
		
	}

}
