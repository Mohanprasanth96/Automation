package org.actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			String parentId = driver.getWindowHandle();
			
			WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            close.click();
            
            Actions acc = new Actions(driver);

			WebElement home = driver.findElement(By.xpath("//div[@class='eFQ30H'][6]"));
			acc.moveToElement(home).perform();
			
			WebElement livingroom = driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']//a[3]"));
			acc.moveToElement(livingroom).perform();
			
			WebElement diningset = driver.findElement(By.xpath("//div[@class='_3XS_gI']//a[4]"));
			diningset.click();

			WebElement search = driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"));
			search.click();
			
			 Set<String> allwindowIs = driver.getWindowHandles();
			    
			    for (String x : allwindowIs) 
			    {	
				   if(!x.equals(parentId))
				   {
				   	  driver.switchTo().window(x);
				   }
			    }
			    
			  WebElement addcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			  addcart.click();

			
	}

}
