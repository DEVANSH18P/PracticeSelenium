package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");	        // Create Actions object
		Actions actions = new Actions(driver);

		// Locate elements
		WebElement doubleClickBtn =
				driver.findElement(By.id("doubleClickBtn"));

		WebElement rightClickBtn =
				driver.findElement(By.id("rightClickBtn"));

		// Double Click
		//	        actions.doubleClick(doubleClickBtn).perform();
		//  actions.contextClick(doubleClickBtn);
		actions.moveToElement(doubleClickBtn);
		System.out.println("Double Click Performed");

		Thread.sleep(2000);

		// Right Click
		actions.contextClick(rightClickBtn).perform();

		System.out.println("Right Click Performed");
		
//		actions.keyDown(Keys.CONTROL)
//	       .sendKeys("a")
//	       .keyUp(Keys.CONTROL)
//	       .perform();
//		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

		//   driver.quit();


		//		//driver.navigate().back();
		//		driver.navigate().forward();
		//		driver.navigate().back();
		//		driver.navigate().back();
		//		
		//		Actions actions  = new Actions(driver);
		//		  WebElement doubleClickBtn =
		//	                driver.findElement(By.id("doubleClickBtn"));
		//
		//	        WebElement rightClickBtn =
		//	                driver.findElement(By.id("rightClickBtn"));
		//	        actions.doubleClick(doubleClickBtn).perform();
		//	        
		//	        System.out.println("Double Click Performed");
		//
		//	        Thread.sleep(2000);
		//	        actions.contextClick(rightClickBtn).perform();
		//	        System.out.println("Right Click Performed");
		//
		//	        

	}

}
