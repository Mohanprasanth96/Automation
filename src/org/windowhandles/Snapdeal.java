package org.windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parentId = driver.getWindowHandle();
	    
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	    search.sendKeys("iphone11");	
	    
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
	    
	    WebElement addcart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		addcart.click();
		
	    WebElement totalamount= driver.findElement(By.xpath("(//span[@class='price'])[2]"));
	    totalamount.click();

	    String text= totalamount.getText();
	    System.out.println(text);

	
	
	}

}
