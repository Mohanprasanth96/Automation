package org.windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement search = driver.findElement(By.xpath("//input[@id='headerSearch']"));
	    search.sendKeys("Celing Fan");	
	    
	    WebElement enter = driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
	    enter.click();	
	    
	    WebElement search1 = driver.findElement(By.xpath("(//img[@class='stretchy'])[2]"));
	    search1.click();
	    
	    WebElement addcart = driver.findElement(By.xpath("(//span[@class='bttn__content'])[2]"));
		addcart.click();
		
		WebElement decline = driver.findElement(By.xpath("//button[@id='HDPPSelectionDeclineButton']//span"));
		decline.click();

	    WebElement totalamount= driver.findElement(By.xpath("(//span[@class='u__bold'])[3]"));

	    String text= totalamount.getText();
	    System.out.println(text);

	}

}
