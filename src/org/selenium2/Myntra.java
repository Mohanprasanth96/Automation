package org.selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		mobile.sendKeys("9677680225");
		
		WebElement cont  = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		    
		cont.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement creat  = driver.findElement(By.xpath("//div[@class='linkPageCreate']"));
	    
		creat.click();
		
	    WebElement pass =	driver.findElement(By.xpath("//input[@class='form-control has-feedbackl']"));
			
	    pass.sendKeys("Mohan@1996");
	    
        WebElement fullname  = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	    
	    fullname.sendKeys("Mohan prasanth");
	    
        WebElement email =	driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		
        email.sendKeys("prasanth27@gmail.com");
        
        WebElement gender  = driver.findElement(By.xpath("(//div[@class='rbContainer'])[1]"));
	    
		gender.click();
		
        WebElement altermobno = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		altermobno.sendKeys("9080840866");
		
        WebElement hintname = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		
		hintname.sendKeys("9600475644");	
		

	}

}
