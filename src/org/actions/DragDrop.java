package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/drag_drop.html ");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Actions acc = new Actions(driver);
			
			WebElement bankdrag = driver.findElement(By.xpath("//li[@id='credit2']"));
			WebElement bankdrop = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
			acc.dragAndDrop(bankdrag, bankdrop).perform();
			
			WebElement bankdebitdrag = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
			WebElement bankdebitdrop= driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
			acc.dragAndDrop(bankdebitdrag, bankdebitdrop).perform();
			
			WebElement salesdrag = driver.findElement(By.xpath("//li[@id='credit1']"));
			WebElement salesdrop = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
			acc.dragAndDrop(salesdrag, salesdrop).perform();
			
			WebElement salescreditdrag = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
			WebElement salescreditdrop = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
			acc.dragAndDrop(salescreditdrag, salescreditdrop).perform();

	}     

}
