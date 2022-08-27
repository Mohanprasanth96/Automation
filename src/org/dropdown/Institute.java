package org.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Institute {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icaionlineregistration.org/Admin_Module/login.aspx");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	     WebElement register = driver.findElement(By.xpath("//a[text()='Register as Faculty']"));
		 register.click();
		 
		 WebElement name = driver.findElement(By.xpath("//select[@id='ddlPOU']"));
	     Select sc = new Select(name);
	     sc.selectByIndex(2);
	        
	     WebElement salutation= driver.findElement(By.xpath("//select[@id='ddlSalutation']"));
	     Select sc1 = new Select(salutation);
	     sc1.selectByIndex(2);
	     
	     WebElement firstname = driver.findElement(By.xpath("//input[@id='txt_name']"));
	     firstname.sendKeys("Mohan");
	
	     WebElement middlename = driver.findElement(By.xpath("//input[@id='txtSecName']"));
	     middlename.sendKeys("prasanth");
	     
	     WebElement lastname = driver.findElement(By.xpath("//input[@id='txt_lastname']"));
	     lastname.sendKeys("E");
	     
	     WebElement dob = driver.findElement(By.xpath("//input[@id='txt_dob']"));
	     dob.sendKeys("02/04/1996");

	     WebElement address = driver.findElement(By.xpath("//textarea[@id='Txt_add']"));
	     address.sendKeys("abcxyx");
	     
	     WebElement state= driver.findElement(By.xpath("//select[@id='ddl_state']"));
	     Select sc2 = new Select(state);
	     sc2.selectByIndex(2);
	     
	     WebElement city = driver.findElement(By.xpath("//select[@id='ddl_City']"));
	     Select sc3 = new Select(city);
	     sc3.selectByIndex(2);
	     
	     WebElement email = driver.findElement(By.xpath("//input[@id='txt_mail']"));
	     email.sendKeys("mohanprasanth27@gmail.com");

	     WebElement landline = driver.findElement(By.xpath("//input[@id='txt_lndln']"));
	     landline.sendKeys("04258 268383");
	     
	     WebElement mobile = driver.findElement(By.xpath("//input[@id='txt_mbl']"));
	     email.sendKeys("9677680225");
	     
	     WebElement pincode = driver.findElement(By.xpath("//input[@id='txt_pin']"));
	     pincode.sendKeys("638702");
	     
	     WebElement pwd = driver.findElement(By.xpath("//input[@id='txt_pswd']"));
	     pwd.sendKeys("mohan96");
	     
	     WebElement repwd = driver.findElement(By.xpath("//input[@id='txt_Repswd']"));
	     repwd.sendKeys("mohan96");
	     
	     WebElement next = driver.findElement(By.xpath("//input[@id='Button1']"));
	     next.click();
	     
	     

	     
	     
	     


	     
	     
	     

		

	}

}
