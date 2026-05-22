package TestQuestions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLoginTest {


	@Test
	public static void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		
	    driver.get("https://google.com");
	    System.out.println(driver.getTitle());
	}
}
