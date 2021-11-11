package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Fb_login2_validation {
	RemoteWebDriver driver ;
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		//Type URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
  public void LoginFBappplication () throws Exception {
		//Type UN & PWD
				driver.findElement(By.id("email")).sendKeys("HiAll7487456@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("priya56789");
				//Click on Login Button
				driver.findElement(By.name("login")).click();
			Thread.sleep(6000);	
	
				if (driver.findElements(By.linkText(" Find your account and log in.")).size()>0) {
		System.out.println("Given credentials are in-valid");
		} else {
	   System.out.println("Given credentials are valid");
	  }
	 }		
	
  @AfterClass
  public void afterClass() {
  driver.quit();
   }

}
