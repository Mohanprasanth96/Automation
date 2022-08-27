package org.windowhandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvBank {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentId = driver.getWindowHandle();
		
		WebElement enterpwd = driver.findElement(By.xpath("//a[text()='Forgot Password']"));
	    enterpwd.click();	
	    
		WebElement username = driver.findElement(By.xpath("(//div[@class='oj-flex-item oj-sm-12 oj-md-4'])[1]"));
	    username.sendKeys("9677680025");	
	    String attribute= username.getAttribute("value");
		System.out.println(attribute);
		
	    WebElement dob = driver.findElement(By.xpath("(//div[@class='oj-flex-item oj-sm-12 oj-md-4'])[2]"));
	    dob.sendKeys("02/04/1996");	
	    String attribute1= dob.getAttribute("value");
		System.out.println(attribute1);
		
		
	    WebElement cont = driver.findElement(By.xpath("(//div[@class='oj-button-label'])[2]"));
	    cont.click();
	    
	    
			    

	}

}
