package TestQuestions;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	WebDriverManager.chromedriver().setup();
//	ChromeDriver driver = new ChromeDriver();

   // driver.get("https://demoqa.com/text-box");
	//IMPLICIT WAIT
    
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
////EXPLICIT WAIT
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//    
//    WebElement button =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
//	
//	button.sendKeys("devansh");
//	
	
    //FLUENT WAIT
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/dynamic-properties");

		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(20))
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class);

		WebElement button = wait.until(driver1 ->
		        driver1.findElement(By.id("visibleAfter")));

		button.click();

		System.out.println("Button clicked");

		//driver.quit();
		}

}
