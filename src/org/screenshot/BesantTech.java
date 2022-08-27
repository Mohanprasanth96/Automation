package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BesantTech {

	public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.besanttechnologies.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        TakesScreenshot besanthome = (TakesScreenshot)driver;
		
		File src = besanthome.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\91967\\Desktop\\Selenium Notes//BesantHome.png");
        FileHandler.copy(src, dest);
	}


	}


