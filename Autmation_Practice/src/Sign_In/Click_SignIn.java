package Sign_In;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click_SignIn {

	@Test
	public void clik_signin() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
        
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        
        driver.findElement(By.className("login")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("javid@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("12346hjk");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
        driver.close();
	}

}
