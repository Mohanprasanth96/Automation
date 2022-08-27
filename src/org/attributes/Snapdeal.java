package org.attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.snapdeal.com/ ");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
		    WebElement enterbutton = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
			enterbutton.click();
			
			WebElement sportsshoes = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
			sportsshoes.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			WebElement pincode = driver.findElement(By.xpath("//input[@id='pincode-check']"));
			pincode.sendKeys("638702");
			
			WebElement check = driver.findElement(By.xpath("//div[@id='pincode-check-bttn']"));
			check.click();
			
			WebElement Asianshoe= driver.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]"));
			Asianshoe.click();
			
			driver.navigate().to("https://www.snapdeal.com/product/asian-white-mesh-textile-sport/662912850947#bcrumbLabelId:255");
			
			WebElement addcart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
			addcart.click();
			
			
			
			
			
			
			
			
			    
			

	}

}
