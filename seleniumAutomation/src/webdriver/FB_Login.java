package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FB_Login {

	public static void main(String[] args) {
		//create an object for web driver/RemoteWebdriver
		// WebDriver driver;
		RemoteWebDriver driver ;
	
		// invoke the chrome browser
       // System.setProperty("key", "Location of your browser driver") 
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		//Type URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//validate the login button is displayed on web page or not?
		if (driver.findElement(By.name("login")).isDisplayed()) {
			System.out.println("Login button is displayed on login screen!");
			} else {
			System.out.println("Login button is NOT displayed on login screen!");
		}
		
		//Type UN & PWD
		driver.findElement(By.id("email")).sendKeys("HiAll7487456@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("priya56789");
		//Click on Login Button
		driver.findElement(By.name("login")).click();
		 }

}
