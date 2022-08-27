package org.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrint {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/ ");
			
			WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            close.click();
		    
			
			WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		    String text1= mobile.getText();
		    System.out.println(text1);

            WebElement Fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
            String text2= Fashion.getText();
		    System.out.println(text2);
		    
		    WebElement Electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
            String text3= Electronic.getText();
		    System.out.println(text3);
		    
		    WebElement beauty = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
            String text4= beauty.getText();
		    System.out.println(text4);
		    
		    WebElement Home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
            String text5= Home.getText();
		    System.out.println(text5);
		    
		    WebElement large = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
            String text6= large.getText();
		    System.out.println(text6);
		    
		    WebElement furniture = driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]"));
            String text7= furniture.getText();
		    System.out.println(text7);
		    
		    WebElement travel = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
            String text8= travel.getText();
		    System.out.println(text8);
		    
		    WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[9]"));
            String text9= grocery.getText();
		    System.out.println(text9);
		    
		    WebElement topoffers = driver.findElement(By.xpath("//h2[@class='_2cAig-']"));
            String text10= topoffers.getText();
		    System.out.println(text10);
		    
		    
		    
		    
		    

	}

}
