package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Browserdriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(3000);
		
	Actions act = new Actions(driver);
		
      //		right click on webelement
     WebElement  rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	act.contextClick(rightclick).perform();
	Thread.sleep(3000);
    //	click on edit menu
	driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]")).click();
	Thread.sleep(3000);
   //	click on ok button on alert
	driver.switchTo().alert().accept();

   //	Do click on the above element to invisible of submenu
	rightclick.click();
	Thread.sleep(3000);
	
   //	Elementclickinterceptedexception 
	
	WebElement doubleclickele = driver.findElement(By.xpath
			("//button[contains(text(),'Double-Click Me To See Alert')]"));
	act.doubleClick(doubleclickele).perform();
	//get the alert text
	System.out.println(driver.switchTo().alert().getText());
	//click on ok button on alert
		driver.switchTo().alert().accept();
	  //driver.get("https://www.platformqedu.com/");
		driver.navigate().to("https://www.platformqedu.com/");
		Thread.sleep(3000);
		//move mouse pointer to webelement products menu
	WebElement productmenu = driver.findElement(By.xpath("//div[contains(text(),'Products')]"));
	act.moveToElement(productmenu).perform();
	Thread.sleep(3000);
	
	driver.get("https://demoqa.com/droppable");
	Thread.sleep(3000);
	//get the drop here text	
	//html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]
	String drophereEletext = driver.findElement(By.xpath("//p[contains(text{},'Drop here')]")).getText();
	System.out.println(drophereEletext);
	//drag and drop of webelements
	 WebElement dragEle  = driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement dropEle  = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	
	act.dragAndDrop(dragEle, dropEle).perform();
	
	Thread.sleep(3000);
	String droppedEletext = driver.findElement(By.xpath("//p[contains(text{},'Dropped!')]")).getText();
	System.out.println(droppedEletext);
	
	
	
	
	
	
	
	
	
	
	}

}
