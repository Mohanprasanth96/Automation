package org.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			js.executeScript("arguments[0].setAttribute('value','Mohan prasanth')",user);
	    	String text =js.executeScript("return arguments[0].getAttribute('value')", user).toString();
			System.out.println(text);
			
		    WebElement pass =	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		    js.executeScript("arguments[0].setAttribute('value','mohan@96')",pass);
		    String text1 =js.executeScript("return arguments[0].getAttribute('value')", pass).toString();
			System.out.println(text1);
			
		    WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		    js.executeScript("arguments[0].click()",login);
		   


	}

}
