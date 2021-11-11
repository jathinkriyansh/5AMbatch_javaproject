package webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetAllErrorMassages {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		//click on submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(6000);
List<WebElement>  allErrorMSG = driver.findElements(By.xpath("//span[contains(@class,'ValidationMessage')]"));
		
      for (WebElement abc : allErrorMSG) {
		System.out.println(abc.getText());
	
      }
	 
	}

}
