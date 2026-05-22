package TestQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		  List<WebElement> rows = driver.findElements(
		            By.xpath("//*[@id='customers']/tbody/tr")
		        );

		        int rowCount = rows.size();

		        // get columns (header)
		        List<WebElement> cols = driver.findElements(
		            By.xpath("//*[@id='customers']/tbody/tr[1]/th")
		        );

		        int colCount = cols.size();

		        System.out.println("Rows: " + rowCount);
		        System.out.println("Columns: " + colCount);

		        // loop through table
		        for (int i = 2; i <= rowCount; i++) {   // skip header

		            for (int j = 1; j <= colCount; j++) {

		                String data = driver.findElement(
		                    By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")
		                ).getText();

		                System.out.print(data + " | ");
		            }

		            System.out.println(); // next line
		        }

		        driver.quit();
			
			

	}

}
