package org.windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentId = driver.getWindowHandle();
			    
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("iphone");	
	    
	    WebElement enter = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    enter.click();	
	    
	    WebElement search1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	    search1.click();	
	    
	    Set<String> allwindowIs = driver.getWindowHandles();
	    
	    for (String x : allwindowIs) 
	    {	
		   if(!x.equals(parentId))
		   {
		   	  driver.switchTo().window(x);
		   }
	    }
	    
	    WebElement addcart = driver.findElement(By.xpath("/input[@id='add-to-cart-button']"));
		addcart.click();
		
	    WebElement firstline = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox']"));
	    firstline.click();
	    
	    String text= firstline.getText();
	    System.out.println(text);
	}
}
