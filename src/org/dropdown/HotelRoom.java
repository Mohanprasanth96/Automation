package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelRoom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
        WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("9677680225");
		
	    WebElement pass =	driver.findElement(By.name("password"));
	    pass.sendKeys("mohan@96");
	    
	    WebElement login = driver.findElement(By.id("login"));
	    login.click();
	    
	    WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
        Select sc = new Select(roomtype);
        
        List<WebElement> list =  sc.getOptions();
        for(WebElement x:list)
        {
        	System.out.println(x.getText());
        }
	}

}
