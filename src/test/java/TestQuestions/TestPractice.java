package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		  driver.manage().window().maximize();
		  
		  
	//	  driver.findElement(By.className("gLFyf")).sendKeys("www.youtube.com");
		driver.findElement(By.id("firstName")).sendKeys("devansh");  
		driver.findElement(By.id("lastName")).sendKeys("pradhan");  
		  driver.findElement(By.xpath("//*[@id=\"registerbtn\"]")).click();
		Thread.sleep(2000);
		  
		//  driver.close();
		  

	}

}
