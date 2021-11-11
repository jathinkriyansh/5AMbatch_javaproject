package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HyperLink_FB {

	public static void main(String[] args) {
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
    driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//To maximize the window
	driver.manage().window().maximize();
	
	//click on ForgotPassword hyper link
	//driver.findElement(By.linkText("Forgotten password?")).click();
	
	driver.findElement(By.partialLinkText("d?")).click();
	  
	
	
	
	}

    }
