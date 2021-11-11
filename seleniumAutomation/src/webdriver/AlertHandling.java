package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException  {
	

		System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		Thread.sleep(3000);
			
		//click on continue to login
		    driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
			Thread.sleep(3000);
		//click on login button without filling any details	
			driver.findElement(By.id("Button2")).click();
			Thread.sleep(8000);
		//Get the alert msg	
			String alertText = driver.switchTo().alert().getText();
			System.out.println(alertText);
		//click on ok button on alert	
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		//click on new user link
			driver.findElement(By.partialLinkText("New User")).click();
			Thread.sleep(3000);
	    //confirmation alert will display
		//Get the alert msg
		    String confalert = driver.switchTo().alert().getText();
			System.out.println(confalert);
		//click on ok button on alert	
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
	}

}
