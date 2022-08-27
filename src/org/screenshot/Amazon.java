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

public class Amazon {

	public static void main(String[] args) throws IOException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String parentId = driver.getWindowHandle();
	    
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("Motorolo");	
	    
	    WebElement enter = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    enter.click();	
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    
	    WebElement search1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
	    search1.click();	
	    
	    Set<String> allwindowIs = driver.getWindowHandles();
	    
	    for (String x : allwindowIs) 
	    {	
		   if(!x.equals(parentId))
		   {
		   	  driver.switchTo().window(x);
		   }
	    }
	    
		TakesScreenshot amazon = (TakesScreenshot)driver;
		
		File src = amazon.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\91967\\Desktop\\Selenium Notes//Motorolo.png");
        FileHandler.copy(src, dest);

	}

}
