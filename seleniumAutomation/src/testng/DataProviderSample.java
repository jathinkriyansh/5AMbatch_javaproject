package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class DataProviderSample {
	RemoteWebDriver driver ;
	
	@Test(dataProvider = "fbcredentials")
  public void f(String un, String pwd) throws InterruptedException {
		//Type UN & PWD
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		//Click on Login Button
		driver.findElement(By.name("login")).click();
	Thread.sleep(6000);	
//create anew facebook account
	if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0 ||
	   driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
		System.out.println("Given credentials are in-valid");
	} else {
		System.out.println("Given credentials are valid");
	   }
	}
 @BeforeClass
  public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
	driver = new ChromeDriver() ;
	//Type URL
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
 @AfterClass
  public void afterClass() {
  driver.quit();
   }
 @DataProvider
  public Object[][] fbcredentials() { 
	  return new Object[][] { 
		  new Object[] { "bcjgfadbe@view.das", "kriyansh89" },
		  new Object[] { "hfveuvif@view.dsa", "priyanka89" },
		  new Object[] { "vggehuttu@view.das", "kumar89" },
		  new Object[] { "h2otestingtools@gmail.com", "selenium@7" },
	  };
  }
}
