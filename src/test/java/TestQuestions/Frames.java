package TestQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
		//ChromeDriver driver  =  new ChromeDriver();
		// NORMAL FRAME 

		//     driver.get("https://demoqa.com/frames");
		//     WebElement frame =  driver.findElement(By.id("frame1"));
		//     driver.switchTo().frame(frame);
		//     String text = driver.findElement(By.id("sampleHeading")).getText();
		//     System.out.println(text);
		//     driver.switchTo().defaultContent();
		//     WebElement frame2 = driver.findElement(By.id("frame2"));
		//     driver.switchTo().frame(frame2);
		//     String text2  =  driver.findElement(By.id("sampleHeading")).getText();
		//     System.out.println(text2);
		//     driver.switchTo().defaultContent();
		//     driver.switchTo().frame(frame);
		//     String text3 =  driver.findElement(By.id("sampleHeading")).getText();
		//     System.out.println("again :" +  text3);
		//     
		//     driver.switchTo().parentFrame();
		//     
		//     driver.quit();
		//     
		//     

		// NESTED FRAMES 
		//driver.get("https://demoqa.com/nestedframes");


		//	List<WebElement> count =  driver.findElements(By.tagName("iframe"));
		//   System.out.println("frames: "+ count.size());
		//   driver.switchTo().frame("frame1");
		//   
		//   int counts =  driver.findElements(By.tagName("iframe")).size();
		//   System.out.println("Children frames: "+ counts);
		//   
		//   System.out.println(driver.findElement(By.tagName("body")).getText());
		//   
		//   // Child Frame 
		//   driver.switchTo().frame(0);
		//   System.out.println(driver.findElement(By.tagName("p")).getText());
		//   
		//   //Back  to Parent 
		//   driver.switchTo().parentFrame();
		//   
		//   
		//   
		//   
		//   System.out.println("back to parent ");
		//   
		//     driver.switchTo().defaultContent();
		//     System.out.println("Back to main page ");
		//     driver.quit();
		//     

		// Count total frames 
		
		 WebDriverManager.chromedriver().setup();

	        ChromeDriver driver = new ChromeDriver();

	        driver.get("https://demoqa.com/nestedframes");

	        int total = countFrames(driver);

	        System.out.println("Total Frames: " + total);

	        driver.quit();


	}public static int countFrames(WebDriver driver) {

	    List<WebElement> frames =
	    driver.findElements(By.tagName("iframe"));

	    int count = frames.size();

	    for(WebElement frame : frames) {

	        driver.switchTo().frame(frame);

	        count += countFrames(driver);

	        driver.switchTo().parentFrame();
	    }

	    return count;
	}

}
