package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
	    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
	    
	    WebElement firstname  = driver.findElement(By.xpath("//input[@id='firstName']"));
	    
	    firstname.sendKeys("Mohan");
	    
	    
        WebElement lastname=	driver.findElement(By.xpath("//input[@id='lastName']"));
		
	    lastname.sendKeys("prasanth");

        WebElement email =	driver.findElement(By.xpath("//input[@id='username']"));
		
        email.sendKeys("prasanth27@gmail.com");
        
        WebElement pass =driver.findElement(By.xpath("//input[@name='Passwd']"));
		
        pass.sendKeys("prasanth@1996");
        
        WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		
        confirm.sendKeys("prasanth@1996");
        
        WebElement next = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		
		next.click();
        
        
        
        
        
        
        
        


	}

}
