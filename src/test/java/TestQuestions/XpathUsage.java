package TestQuestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// driver.close();
		// Xpath using id
		// driver.findElement(By.xpath("//input[@id =
		// 'autocomplete']")).sendKeys("helloo");
		// XPATH USING START-WITH
		// driver.findElement(By.xpath("//input[starts-with(@class,'inputs
		// ui')]")).sendKeys("hiii");
		// XPATH USING CONTAINS
		// driver.findElement(By.xpath("//input[contains (@class,'inputs
		// ui')]")).sendKeys("jai hoo");
		// XPATH USING AND OR METHOD
		// driver.findElement(By.xpath("//button[@id='openwindow' and @class ='btn-style
		// class1'] ")).click();

		// RADIO BUTTON HANDLING
		/*
		 * WebElement radiobtn=
		 * driver.findElement(By.xpath(" //input[@value = 'radio1']"));
		 * radiobtn.click();
		 * driver.findElement(By.xpath(" //input[@value = 'radio2']")).click();
		 * if(radiobtn.isSelected()) { radiobtn.click(); }
		 */

		// DROPDOWN BUTTON
		// select class use in dropdown
		/*
		 * WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 * Select select = new Select(dropdown); select.selectByIndex(2);
		 * select.selectByValue("option1"); Thread.sleep(1000);
		 * select.selectByValue("option2");
		 * 
		 */

		// CHECKBOX ELEMENT
// isSelected for checkbox and radio 
		/*
		 * WebElement checkbox1 =
		 * driver.findElement(By.xpath(" //input[@id = 'checkBoxOption1']"));
		 * checkbox1.click();
		 * driver.findElement(By.xpath(" //input[@id = 'checkBoxOption2']")).click(); if
		 * (checkbox1.isSelected()) { checkbox1.click(); }
		 */

		// Handle Simple Alert

		/*
		 * driver.findElement(By.id("name")).sendKeys("Devansh Pradhan");
		 * driver.findElement(By.id("alertbtn")).click(); Alert alert =
		 * driver.switchTo().alert(); alert.getText();
		 * System.out.print(alert.getText());
		 */
		// Handle Confirm Alert
        
	/*	 driver.findElement(By.id("name")).sendKeys("Devansh Pradhan");
		 driver.findElement(By.id("confirmbtn")).click();
		 Alert alert = driver.switchTo().alert();
		 System.out.print(alert.getText());
		// alert.accept();
		// alert.dismiss();
*/
		
		// HANDLE AUTO-SUGGESTIONS 
        /*driver.findElement(By.id("autocomplete")).sendKeys("Ind");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        List<WebElement> options = wait.until(
            ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("li.ui-menu-item div")
            )
        );

        for (WebElement option : options) {
            if (option.getText().trim().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
*/
		// Windo Handles 
		
	/*	String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		
		Thread.sleep(2000);
		Set<String> windowhandles = driver.getWindowHandles();
		
		Iterator<String>it = windowhandles.iterator();
		
		while(it.hasNext()){
			String Window = it.next();
		    if(!Window.equals(parentWindow)) {
		    	driver.switchTo().window(Window);
		    	break;
		    }
		}
		Thread.sleep(2000);
	     System.out.println("child title:" + driver.getTitle());
        driver.switchTo().window(parentWindow);
        System.out.println("Parent title:" + driver.getTitle());
        driver.quit();
	*/
		
	//  Switching tabs
		/*String tab1 = driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(2000);
		
		Set<String>st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			String window = it.next();
			if(!window.equals(tab1)) {
				driver.switchTo().window(window);
				break;
			}
		}
		Thread.sleep(3000);
		System.out.println("child:" + driver.getTitle());
		
		driver.switchTo().window(tab1);
		System.out.println("parent:" + driver.getTitle());
		*/
		// TABLE

		
	
	}
	
}
