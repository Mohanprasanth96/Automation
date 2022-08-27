package org.actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopcules {
 
	public static void main(String[] args) {
		
		            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://www.shopclues.com/wholesale.html");
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					
					String parentId = driver.getWindowHandle();
					
					Actions acc = new Actions(driver);
					
					WebElement mobiles = driver.findElement(By.xpath("//li[@id='nav_44']"));
					acc.moveToElement(mobiles).perform();
					
					WebElement mi = driver.findElement(By.xpath("((//div[@id='column_0'])[1]//a)[3]"));
					mi.click();
					
					
					Set<String> allwindowIs = driver.getWindowHandles();
				    
				    for (String x : allwindowIs) 
				    {	
					   if(!x.equals(parentId))
					   {
					   	  driver.switchTo().window(x);
					   }
				    }
					
				    WebElement search = driver.findElement(By.xpath("//div[@id='mCSB_7_container']//li[1]"));
					search.click();
					
	}

}
