package TestQuestions;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageLoadWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));
        
        

        wait.until(webDriver ->
            ((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState")
            .equals("complete")
        );

        System.out.println("Page fully loaded");

        driver.quit();

	}

}
