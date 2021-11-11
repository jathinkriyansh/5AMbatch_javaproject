package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.testng.annotations.AfterClass;

public class crossbrowsertesting_FB_Login {
	RemoteWebDriver driver ;
  
	//String browsername = "Opera";
	
	@Parameters(" browsername")
	@BeforeClass
  public void beforeClass(@Optional("chrome") String browsername) {
if (browsername.equalsIgnoreCase("chrome")) {
	  //chrome
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\King\\Desktop\\selenium_workspace\\worksace\\seleniumAutomation\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
} else if (browsername.equalsIgnoreCase("firefox")) {
	//firefox
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\King\\Desktop\\selenium_workspace\\worksace\\seleniumAutomation\\Browserdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
}else if (browsername.equalsIgnoreCase("edge")) {
	//edge
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\King\\Desktop\\selenium_workspace\\worksace\\seleniumAutomation\\Browserdriver\\msedgedriver.exe");
		driver = new EdgeDriver();	
}    else {
	System.out.println("plese give valid browser name***********");
}
		
		
	
		
	
				//Type URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
  }
  
  @Test
  public void tc_001_validateloginbutton() {
	//validate the login button is displayed on web page or not?
			if (driver.findElement(By.name("login")).isDisplayed()) {
				System.out.println("Login button is displayed on login screen!");
				} else {
				System.out.println("Login button is NOT displayed on login screen!");
			}
 }
  
  @Test
  public void tc_002_loginfbapplication() {
	//Type UN & PWD
			driver.findElement(By.id("email")).sendKeys("HiAll7487456@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("priya56789");
			//Click on Login Button
			driver.findElement(By.name("login")).click();
			 }

  
  
  @AfterClass
  public void afterClass() {
 // driver.quit();
  }

}
