package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadionBtnAndCheckBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
// CHECKBOX 
//driver.get("https://demoqa.com/checkbox");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[2]")).click();
//  WebElement checkbox = driver.findElement(By.xpath("//span[@aria-label='Select Downloads']"));
//  checkbox.click();
//Thread.sleep(1000);  
//  if(!checkbox.isSelected()) {
//	  checkbox.click();
//  }

//RADIO BUTTON
driver.get("https://demoqa.com/radio-button");
WebElement radiobtn =  driver.findElement(By.id("yesRadio"));
radiobtn.click();

if(radiobtn.isSelected())
{
	System.out.print("selected");
}

System.out.println(radiobtn.isDisplayed());

	radiobtn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	}
   
}
