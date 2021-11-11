package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Betaspicejet {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get(" https://beta.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad (HYD");
 Thread.sleep(6000);
 driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bengaluru (BLR)");
	
}

}
