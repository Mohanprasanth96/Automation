package org.actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopcules2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String parentId = driver.getWindowHandle();
		
		Actions acc = new Actions(driver);
		
		WebElement sports= driver.findElement(By.xpath("//li[@id='nav_45']"));
		acc.moveToElement(sports).perform();
		
		WebElement weight = driver.findElement(By.xpath("//div[@id='rightpanel_45']//div//div[1]//ul//li[3]//a"));
		weight.click();
		
		Set<String> allwindowIs = driver.getWindowHandles();
	    
	    for (String x : allwindowIs) 
	    {	
		   if(!x.equals(parentId))
		   {
		   	  driver.switchTo().window(x);
		   }
	    }
		
	    WebElement search = driver.findElement(By.xpath("(//div[@class='img_section img_280'])[1]"));
		search.click();
		
		Thread.sleep(10000);
	
        Set<String> allwindowIs1 = driver.getWindowHandles();
        int i = 0;
	    for (String y : allwindowIs1) 
	    {	
		   if(i==2)
		   {
		   	  driver.switchTo().window(y);
		   }
	       i++;
	    }
	    
	    
	    WebElement addcart = driver.findElement(By.xpath("//button[@id='add_cart']"));
	    addcart.click();
	    WebElement cart = driver.findElement(By.xpath("(//div[@class='sc_rlinks_btm']//li)[4]"));
	    acc.moveToElement(addcart).perform();
		WebElement viewcart = driver.findElement(By.xpath("//div[@class='buttonContainer']//a[1]"));
		viewcart.click();
		WebElement amount = driver.findElement(By.xpath("//div[@class='gd_total']//p[2]"));
		String text = amount.getText();
		System.out.println("Total price: "+text);
		
		
		
		

		
	}

}
