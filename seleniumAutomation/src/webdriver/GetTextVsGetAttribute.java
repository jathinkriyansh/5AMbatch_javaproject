package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	    Thread.sleep(3000);

	//get the google search button text
	 //   String googlesearchbutton = driver.findElement(By.name("btnK")).getText();
	//    System.out.println(" googlesearchbutton is: " +googlesearchbutton);
	
	    String googlesearchbutton = driver.findElement(By.name("btnK")).getAttribute("value");
	System.out.println(googlesearchbutton);
	
	
	
	
	
	
	
	}

}
