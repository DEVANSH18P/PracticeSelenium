package TestQuestions;

///import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
	//	System.out.println("current url:"+ driver.getCurrentUrl());
		//System.out.println("current TITLE:"+ driver.getTitle());
		//System.out.println("current url:"+ driver.getPageSource().substring(0,100));
	//System.out.println(	"WIDOW HANDLW:" + driver.getWindowHandle());
		String parent = driver.getWindowHandle();

		WebElement link1 = driver.findElement(By.id("newWindowBtn"));
		link1.click();

		// wait for new window
		Thread.sleep(2000);

		// get UPDATED handles
		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println("Total windows: " + windowHandles.size());

		for (String window : windowHandles) {
		    driver.switchTo().window(window);
			    

		        System.out.println("Child Title: " + driver.getTitle());
		        System.out.println("Child URL: " + driver.getCurrentUrl());
		}

		// switch back to parent
		driver.switchTo().window(parent);

		System.out.println("Parent Title: " + driver.getTitle());
		System.out.println("Parent URL: " + driver.getCurrentUrl());

		driver.quit();
	}
	
	
	
}
