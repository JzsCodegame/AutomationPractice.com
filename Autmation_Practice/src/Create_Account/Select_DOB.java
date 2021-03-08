package Create_Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_DOB {

	@Test
	public void DOB() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
        
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        
        driver.findElement(By.className("login")).click();
       
        driver.findElement(By.id("email_create")).sendKeys("javid@gamil.com");
        driver.findElement(By.name("SubmitCreate")).click();
        
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();//tagName[@attribute='value'] xpath rule
        driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Fahim");// --"tagname#id-value" css rule;
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Khan");// BY copy of Xpath
        driver.findElement(By.cssSelector("#passwd")).sendKeys("ayan");// BY copy of Css
        WebElement day = driver.findElement(By.cssSelector("#days"));//Weblement created for 
        day.click();
        Select Day = new Select(day); //By using Select Method
        Day.selectByIndex(10);
        WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        month.click();
        Select Month = new Select(month);
        Month.selectByValue("6");
        WebElement year = driver.findElement(By.cssSelector("#years"));
        year.click();
        Select Year = new Select(year);
        Year.selectByVisibleText("2003  ");
        driver.findElement(By.cssSelector("#submitAccount")).click();
        
        
        
	}

}
