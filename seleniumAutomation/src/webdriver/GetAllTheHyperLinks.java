package webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetAllTheHyperLinks {

	public static void main(String[] args) {
		
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", ".\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//String:  can store one value
		//array:   can store multiple values but nits limited
		//list:    can store multiple values but nits un-limited
		
		//Get all hyperlinks
		List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
		System.out.println(allhyperlinks.size());//25
		
	//print all the hyper links
		for (WebElement abc : allhyperlinks) {
			
			System.out.println(abc.getText());
		}
	
	}

}
