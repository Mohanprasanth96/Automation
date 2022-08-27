package org.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registeration {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp ");

			    WebElement firstname  = driver.findElement(By.xpath("//input[@id='firstName']"));
			    firstname.sendKeys("Mohan");
			    String attribute= firstname.getAttribute("value");
				System.out.println(attribute);
			    
		        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
			    lastname.sendKeys("prasanth");
			    String attribute1= lastname.getAttribute("value");
				System.out.println(attribute1);
				
		        WebElement email =	driver.findElement(By.xpath("//input[@id='username']"));
		        email.sendKeys("prasanth27@gmail.com");
		        String attribute2= email.getAttribute("value");
				System.out.println(attribute2);
		        
		        WebElement pass =driver.findElement(By.xpath("//input[@name='Passwd']"));
		        pass.sendKeys("prasanth@1996");
		        String attribute3= pass.getAttribute("value");
				System.out.println(attribute3);
				
		        WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		        confirm.sendKeys("prasanth@1996");
		        String attribute4= confirm.getAttribute("value");
				System.out.println(attribute4);
				
				WebElement showpass = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		        showpass.click();
		       
		        WebElement next = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
				next.click();
		        
	}

}
