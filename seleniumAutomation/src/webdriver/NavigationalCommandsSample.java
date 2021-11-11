package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationalCommandsSample {

	public static void main(String[] args) throws Exception {
	RemoteWebDriver driver ;
	System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
	driver = new ChromeDriver() ;
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();			

	     driver.findElement(By.linkText("Forgotten password?")).click();            
	Thread.sleep(5000);
	
	driver.findElement(By.id("identify_email")).sendKeys("AFasFD");
	
	//click on Refresh icon
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	//click on Back icon
	driver.navigate().back();
	Thread.sleep(5000);
	
	//Get the app URL
	System.out.println(driver.getCurrentUrl());
	
	//click on forward icon
	driver.navigate().forward();
	//Get the app URL
	System.out.println("********"+driver.getCurrentUrl());
	
	
	
	
	
	
	
	
	}

}
