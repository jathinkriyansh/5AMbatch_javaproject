package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CloseVsQuite {

	public static void main(String[] args) {
	
		RemoteWebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\King\\Desktop\\selenium_workspace\\worksace\\seleniumAutomation\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//close(): close the current window
		//driver.close();
		
		//Quit () : close the current window as well as child window(s)
		driver.quit();
	
}

}
