package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/login");
      // driver.close();
       driver.findElement(By.name("username")).sendKeys("tomsmith");
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
       driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
       String msg = driver.findElement(By.id("flash")).getText();
       System.out.println(msg);
       
	}

}
