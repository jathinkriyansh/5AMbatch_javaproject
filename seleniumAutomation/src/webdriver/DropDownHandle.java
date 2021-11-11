package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		
	
	//driver.findElement(By.xpath("//a[@data-testid='open-regestration-form-button']")).click();
	//wait statement
	Thread.sleep(8000);
	
	driver.findElement(By.id("firstName")).sendKeys("priyanka");
	
	//dropdown code
	Select CountryofCitizenshipdropdwon = new Select(driver.findElement(By.id("country")));
	CountryofCitizenshipdropdwon.selectByVisibleText("UNITED STATES");

	
	
                                       
	
	
	
	
	
	
	
	}

}
