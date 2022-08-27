package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws AWTException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
			Actions acc = new Actions(driver);
			WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			acc.sendKeys(user,"Prasanth").doubleClick(user).contextClick(user).perform();
			
		    Robot r = new Robot();
		    
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    
		    r.keyPress(KeyEvent.VK_TAB);
		    r.keyRelease(KeyEvent.VK_TAB);
		   	    
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_CONTROL);



	}

}
