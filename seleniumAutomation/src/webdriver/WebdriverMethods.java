package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws Exception {
		//create an object for web driver/RemoteWebdriver
				// WebDriver driver;
				RemoteWebDriver driver ;
			
				// invoke the chrome browser
		       // System.setProperty("key", "Location of your browser driver") 
				System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
				driver = new ChromeDriver() ;
				//Type URL
				driver.get("https://www.facebook.com/");
				//getCurrentUrl() : get the current page URL
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				//Get title
				String title = driver.getTitle();
				System.out.println(title);
				
				//System.out.println(driver.getCurrentUrl());
				//click on forgetten passward? link

	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(5000);
	
	//getCurrentUrl() : get the current page URL
	String fp_url = driver.getCurrentUrl();
	System.out.println(fp_url);
	//Get title
	String fp_title = driver.getTitle();
	System.out.println(fp_title);
	
	
	//validate the next page URL has changed or not?
	if (fp_url.contains("recover")) {
		System.out.println("forgetten passward? page has displayed succssesfully");
	} else {
		System.out.println("forgetten passward? page has NOT displayed succssesfully");
	}
	
	
	
	
	
	
	
	
	}

}
