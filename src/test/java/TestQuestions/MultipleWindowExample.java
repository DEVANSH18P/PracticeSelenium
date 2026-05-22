package TestQuestions;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowExample {



		    public static void main(String[] args) throws InterruptedException {

//		        ChromeDriver driver = new ChromeDriver();
//		        driver.get("https://the-internet.herokuapp.com/windows");
//
//		        // store parent window
//		        String parent = driver.getWindowHandle();
//
//		        // open multiple windows
//		        driver.findElement(By.linkText("Click Here")).click();
//		        driver.findElement(By.linkText("Click Here")).click();
//
//		        // wait for windows to open
//		        Thread.sleep(3000);
//
//		        // get all windows
//		        Set<String> windows = driver.getWindowHandles();
//
//		        System.out.println("Total windows: " + windows.size());
//
//		        // loop through all windows
//		        for (String window : windows) {
//
//		            driver.switchTo().window(window);
//
//		            System.out.println("Title: " + driver.getTitle());
//		            System.out.println("URL: " + driver.getCurrentUrl());
//		        }
//
//		        // switch back to parent
//		        driver.switchTo().window(parent);
//		        System.out.println("Back to Parent: " + driver.getTitle());
//
//		   //     driver.quit();
//		 
		
		    	WebDriverManager.chromedriver().setup();
		    	ChromeDriver driver = new ChromeDriver();

		    	driver.get("https://demoqa.com/browser-windows");
		    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		    	String parent = driver.getWindowHandle();
		    	System.out.println("Parent window: " + parent);

		    	// OPEN NEW WINDOW
		    	driver.findElement(By.id("windowButton")).click();

		    	Set<String> windows = driver.getWindowHandles();

		    
		    	for(String win : windows) {
		    	    if(!win.equals(parent)) {
		    	        driver.switchTo().window(win);
		    	        System.out.println("Child window title: " + driver.getTitle());
		    	        System.out.println("Child window URL: " + driver.getCurrentUrl());

		    	      // driver.close(); // close child window
		    	     //   break;
		    	    }
		    	}

		    	// BACK TO PARENT
		    	driver.switchTo().window(parent);

		    	// OPEN NEW TAB
		    	driver.findElement(By.id("tabButton")).click();

		    	Set<String> tabs = driver.getWindowHandles();

		    	for(String tab : tabs) {
		    	    if(!tab.equals(parent)) {
		    	        driver.switchTo().window(tab);

		    	        System.out.println("Child tab title: " + driver.getTitle());
		    	        System.out.println("Child tab URL: " + driver.getCurrentUrl());

		    	       // driver.close(); // close tab
		    	        //break;
		    	    }
		    	}

		    	// BACK TO PARENT AGAIN
		    	driver.switchTo().window(parent);

		    	//driver.quit();
		    	}

}
