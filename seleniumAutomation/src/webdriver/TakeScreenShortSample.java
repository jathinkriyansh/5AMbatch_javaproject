package webdriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShortSample {

	public static void main(String[] args) throws Exception  {
	   System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		Thread.sleep(3000);
			
	Date d = new Date() ;
	 DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss") ;
	 String timeStamp = df.format(d);
	
	 String sreenshotpath = ".\\screenshots\\";
	 //Take a screenshot, it will store temp into RAM location
	File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Move the File to screenshot folder
    FileHandler.copy(abc,new File(sreenshotpath+"TestResults"+timeStamp+".PNG") );
	
	//take a webelement (loggin button)screenshot
	WebElement logginbutton = driver.findElement(By.name("email"));
	
   // Get entire page screenshot
	BufferedImage  fullImg = ImageIO.read(abc);
  // Get the location of element on the page
	Point point = logginbutton.getLocation();

	// Get width and height of the element
	int eleWidth = logginbutton.getSize().getWidth();
	int eleHeight = logginbutton.getSize().getHeight();
    System.out.println("element width is:"+eleWidth);
	System.out.println("element hight is:"+eleHeight);
	
	// Crop the entire page screenshot to get only element screenshot
	BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
	ImageIO.write(eleScreenshot, "png", new File(sreenshotpath+"\\fblogin1.PNG"));
	
	}

}
