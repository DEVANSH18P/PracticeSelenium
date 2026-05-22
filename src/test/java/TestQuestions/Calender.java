package TestQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.ixigo.com/flights?utm_source=bing&utm_medium=paid_search_bing&utm_campaign=Generic_Search_Sept_bing&msclkid=aff576810a011a2225481c8ee0a53d75&utm_term=spicejet&utm_content=Airline");
		driver.findElement(By.className("flex-1 h-full flex flex-col justify-center px-15 py-10")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Thread.sleep(3000);
		driver.findElement(By.className("react-calendar__tile react-calendar__tile--now react-calendar__tile--active react-calendar__tile--range react-calendar__tile--rangeStart react-calendar__tile--rangeEnd react-calendar__tile--rangeBothEnds react-calendar__month-view__days__day")).click();
		
		

	}

}
