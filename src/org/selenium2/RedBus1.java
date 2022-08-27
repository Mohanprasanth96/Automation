package org.selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus1 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.redbus.in/ ");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;

			WebElement icon = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
			js.executeScript("arguments[0].click()",icon);
			
		    WebElement signin =	driver.findElement(By.xpath("//li[@id='signInLink']"));
		    js.executeScript("arguments[0].click()",signin);
		    
            WebElement frame1 =	driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
            driver.switchTo().frame(frame1);
            
            WebElement mobile = driver.findElement(By.xpath("//div[@class='mobileInput clearfix']//input"));
            mobile.sendKeys("9677680225");
           		    
            WebElement frame2 =	driver.findElement(By.xpath("//div[@id='recaptchaElement']//div//div//iframe"));
            driver.switchTo().frame(frame2);

		    WebElement checkbox = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
		    checkbox.click();
		   
		    driver.switchTo().parentFrame();
		    
		    WebElement otp = driver.findElement(By.xpath("//div[@class='otpContainer clearfix border-r-3 otp-margin-fix']"));
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    wait.until(ExpectedConditions.elementToBeClickable(otp));
		    js.executeScript("arguments[0].click()",otp);	  
		    
	}
}
