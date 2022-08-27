package org.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettyImage {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drop = driver.findElement(By.xpath("//div[@class='DesktopMediaFilter-module__mainLabel___h1cMI']"));
	    drop.click();
	    
	    WebElement video = driver.findElement(By.xpath("(//li[@class='DesktopMediaFilter-module__headerOption___Sl3Pf'])[2]"));
	    video.click();
	   
	}

}
