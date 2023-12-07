package TestProject.TestNGproject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	@Test @Parameters({"username", "password"}) 
	public void test1(String username, String password)
	{
		WebDriver driver;
		//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
        //driver = new FirefoxDriver();
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://dribbble.com/tags/ecommerce_app");
        
        //click login button
        driver.findElement(By.className("nav-v2-dynamic__login")).click();
        //Enter user name and password
        driver.findElement(By.id("login")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
	}
}

