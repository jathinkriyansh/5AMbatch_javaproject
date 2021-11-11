package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

   public class ValidationCommands {

	public static void main(String[] args) throws Exception {
	
		RemoteWebDriver driver ;
	    System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		//validate the webelement is displayed on page or not?
	if (driver.findElement(By.id("enableAfter")).isDisplayed()) {
			System.out.println("webelement is displayed on Login screen!");
		Thread.sleep(6000);
		if (driver.findElement(By.id("enableAfter")).isEnabled()) {
			System.out.println("element is in enabled state");
		} else {
			System.out.println("element is  in disable state");
		}	
	} else {
			System.out.println("webelement is NOT displayed on Login screen!");
			}
			
//	try {
//			if (driver.findElement(By.id("visibleAfter")).isDisplayed()) {
//				System.out.println("element is displayed on screen by default");
//				}
//         } catch (Exception NoSuchElementException) {
//			if (driver.findElements(By.id("visibleAfter")).size()>0) {
//				System.out.println("*****element is displayed on screen by default");
//				} else {
//				System.out.println("*******element is NOT displayed on screen by default");
//			}	
//		}

   driver.navigate().to("https://demoqa.com/checkbox");
   //check the  checkbox is selected or not?
	WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/label/span[1]"));

    if (ele.isSelected()) {
	System.out.println("checkbox is selected");
	} else {
	System.out.println("checkbox is NOT selected");
	}
    Thread.sleep(6000);
    ele.click();
    Thread.sleep(6000);
    if (ele.isSelected()) {
    	System.out.println("**********checkbox is selected");
    	} else {
    	System.out.println("**********checkbox is NOT selected");
    	}
	
	
	
	
	
	
	
	}

}
