package TestQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector(".button")).getAttribute("id"));
		System.out.println("\n");
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("devansh");
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
        driver.findElement(By.cssSelector(" input[placeholder='Enter your security question']")).sendKeys("what is your pet name ");
	    driver.findElement(By.cssSelector("input.name[placeholder = 'First Name']")).sendKeys("Devansh");
	    driver.findElement(By.cssSelector("input#lastName[placeholder = 'Last Name']")).sendKeys("Pradhan");
    //partial text  input[placeholder~='Name']
	    // input[placeholder*= 'Enter your']- matches substring
	    //enter 
	    
	    //.container>input[name="fname"]-- child selector , form>div.container
	    //Descendant  .container select - all the 
	    // Multiple level sub child targeting -div div div div div div.widget.LinkList#LinkList940
	    // Next - sibling - .mytest + .my_test + .my-test
	    //First Child - div input:first-child
	    //  nth-child  - #option div:nth-child(1)
	    // nth-last-child -#option div:nth-last-child(1)
	    //  first-of-type = #option div:first-of-type
	    //last-of-type = #option div:last-of-type
	    // nth-of-type = #option div:nth-of-type(1)
	    
	}

}
