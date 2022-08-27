package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {

	public static void main(String[] args) throws IOException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parentId = driver.getWindowHandle();
	    
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	    search.sendKeys("HP laptop");	
	    
	    WebElement enter = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	    enter.click();	
	    
	    WebElement search1 = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	    search1.click();	
	    
	    Set<String> allwindowIs = driver.getWindowHandles();
	    
	    for (String x : allwindowIs) 
	    {	
		   if(!x.equals(parentId))
		   {
		   	  driver.switchTo().window(x);
		   }
	    }

        TakesScreenshot flipkart = (TakesScreenshot)driver;
		
		File src = flipkart.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\91967\\Desktop\\Selenium Notes//HP laptop.png");
        FileHandler.copy(src, dest);
	    
	}
}
