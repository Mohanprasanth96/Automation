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

public class Swiggy {

	public static void main(String[] args) throws AWTException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.swiggy.com/chennai/login-besant-nagar-adyar");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
			Actions acc = new Actions(driver);
			WebElement signin = driver.findElement(By.xpath("(//span[@class='_3yZyp'])[2]"));
			signin.click();
			
			WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
			acc.sendKeys(mobile,"9677680225").doubleClick(mobile).contextClick(mobile).perform();
			
			WebElement login = driver.findElement(By.xpath("//div[@class='_25qBi _2-hTu']"));
			login.click();
			
			WebElement otp = driver.findElement(By.xpath("//div[@class='_25qBi _2-hTu']"));
			otp.click();
			
		    Robot r = new Robot();

		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		   		   	    
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_CONTROL);
	}
}
