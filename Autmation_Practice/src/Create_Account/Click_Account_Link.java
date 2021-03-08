package Create_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_Account_Link {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      
        driver = new ChromeDriver();
	
}
	@Test(priority = 0)
	public void open_browser() {
		driver.get("http://automationpractice.com/index.php");
	}
	@Test(priority = 1)
	public void click_signIN() {
		driver.findElement(By.className("login")).click(); //Find the element by class name
	}
	@Test(priority = 2)
	public void email_address() {
		driver.findElement(By.id("email_create")).sendKeys("javid@gamil.com");//Find the element by id.
	}
	@Test(priority = 3)
	public void Create_Account() {
		driver.findElement(By.name("SubmitCreate")).click();//Find the element by name.
	}
	@AfterTest
	public void close_browser() {
		driver.close();
	}
	
}
