package org.windowhandles;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Flipkart {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String parentId = driver.getWindowHandle();
			
			WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            close.click();
		    
			WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		    search.sendKeys("iphone12");	
		    
		    WebElement enter = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		    enter.click();	
		    
		    WebElement search1 = driver.findElement(By.xpath("//div[@class='_2kHMtA']"));
		    search1.click();	
		    
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
			
		    WebElement totalamount= driver.findElement(By.xpath("//div[@class='Ob17DV _3X7Jj1']//span"));
		   

		    String text= totalamount.getText();
		    System.out.println(text);
	}

}
