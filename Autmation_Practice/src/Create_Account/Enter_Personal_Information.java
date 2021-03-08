package Create_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enter_Personal_Information {

	@Test
	public void Personal_Information() throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
        
		driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        
        driver.findElement(By.className("login")).click();
       
        driver.findElement(By.id("email_create")).sendKeys("javid@gamil.com");
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();//tagName[@attribute='value'] xpath rule
        driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Fahim");// --"tagname#id-value" css rule;
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Khan");// BY copy of Xpath
        driver.findElement(By.cssSelector("#passwd")).sendKeys("ayan");// BY copy of Css
        driver.close();
        
        
	}

}
