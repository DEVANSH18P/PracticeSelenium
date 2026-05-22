package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text() = 'Email']//following-sibling::input[1]")).sendKeys("dev@gmil");
		/*	Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text() = 'Email']//following-sibling::input[1]//parent::div")).sendKeys("deva@gmil");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text() = 'Email']//parent::div")).sendKeys("devff@gmil");
		Thread.sleep(1000);
		*/
		driver.findElement(By.xpath(" //td[text() = 'Maria Anders']//preceding-sibling::td//child::input")).click();
		
		////div[@class= 'container']//child::label -  select all children
		/////div[@class= 'container']//child::label[1]  specific children
		//////div[@class= 'container']//child::label[@attribute = 'value']-specific children
       // preceding children - //label[text()= 'Email']//preceding::input[2]
		

	}

}
