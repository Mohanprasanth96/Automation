package org.scrollupdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Besant {

	public static void main(String[] args) throws IOException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.besanttechnologies.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
            JavascriptExecutor js = (JavascriptExecutor)driver;
			
			WebElement last = driver.findElement(By.xpath("//div[@class='foo_navs pb-3']"));
			js.executeScript("arguments[0].scrollIntoView(true)",last);
			
		    TakesScreenshot besanthome = (TakesScreenshot)driver;
		    File src = besanthome.getScreenshotAs(OutputType.FILE);
		    File dest = new File("C:\\Users\\91967\\Desktop\\Selenium Assignments//besanthome.png");
			FileHandler.copy(src, dest);
			
			
			WebElement middel = driver.findElement(By.xpath("//div[@class='choose_box']"));
			js.executeScript("arguments[0].scrollIntoView(false)",middel);

			TakesScreenshot besanthome2 = (TakesScreenshot)driver;
		    File src1 = besanthome2.getScreenshotAs(OutputType.FILE);
		    File dest1 = new File("C:\\Users\\91967\\Desktop\\Selenium Assignments//besanthome2.png");
			FileHandler.copy(src1, dest1);
	
			WebElement first= driver.findElement(By.xpath("(//img[@class='img-fluid'])[1]"));
			js.executeScript("arguments[0].scrollIntoView(true)",first);

			TakesScreenshot besanthome3 = (TakesScreenshot)driver;
		    File src2 = besanthome2.getScreenshotAs(OutputType.FILE);
		    File dest2 = new File("C:\\Users\\91967\\Desktop\\Selenium Assignments//besanthome3.png");
			FileHandler.copy(src2, dest2);
	
	
	}
}
	

