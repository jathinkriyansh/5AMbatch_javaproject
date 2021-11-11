package webdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Thread.sleep(3000);
		
       //String parentwindow = driver.getWindowHandle();
	   
        System.out.println("******************************");
        ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(1) );
        Thread.sleep(3000);
        //click on java menu
        driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
        //to close the child tab
		//driver.close();
		
	
	      }
	}


