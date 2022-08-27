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

public class Flipkart2 {

	public static void main(String[] args) throws AWTException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            close.click();
            
			Actions acc = new Actions(driver);
			WebElement Fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
			acc.moveToElement(Fashion).perform();
			
			WebElement Electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
			acc.moveToElement(Electronic).contextClick(Electronic).perform();

			Robot r = new Robot();
			
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);

		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
			

	}

}
