package TestQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassUsesDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver ();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown =
				driver.findElement(By.id("oldSelectMenu"));

		Select select = new Select(dropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Select by visible text
		select.selectByVisibleText("Purple");
		//Thread.sleep(1000);
		//IMPLICIT WAIT 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

/ 
		// Select by value

		select.selectByValue("7");
		//  Thread.sleep(1000);
		// Select by index
		//  select.selectByIndex(2);
	}

}
