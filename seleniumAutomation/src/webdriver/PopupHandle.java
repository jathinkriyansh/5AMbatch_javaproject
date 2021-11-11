package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {

	private static final char[] String = null;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
        String parentwindow = driver.getWindowHandle();
	   
        System.out.println("******************************");
        Set<String> allwindowIds = driver.getWindowHandles();
     	for (String string : allwindowIds) {
		System.out.println(string);
	     }
	   //cross check whether the page is main page or child page based on the window ID?
	
	     Iterator<String> abc = allwindowIds.iterator();
	    while (abc.hasNext()) {
		String childwindow = (String) abc.next();
		if (!parentwindow.equals(childwindow)) {
			driver.switchTo().window(childwindow);
		//to close the current window
			driver.close();
		Thread.sleep(3000);
		
		}
	
}       //whil loop end
		driver.quit();
		
	}
       }


