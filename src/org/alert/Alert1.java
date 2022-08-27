package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
			WebElement alert = driver.findElement(By.id("alertButton"));
			alert.click();
			Alert a = driver.switchTo().alert();
		    a.accept();
			
		    WebElement waitalert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
            waitalert.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert a1 = driver.switchTo().alert();
	        String text = a1.getText();		
			System.out.println(text);
		    a1.accept();
		    

		    WebElement confirm = driver.findElement(By.id("confirmButton"));
		    confirm.click();
		    Alert a2 = driver.switchTo().alert();
		    String text1 = a2.getText();		
			System.out.println(text1);
		    a2.dismiss();
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		    js.executeScript("arguments[0].click()",prompt);
		    Alert a3 = driver.switchTo().alert();
		    String text2 = a3.getText();		
			System.out.println(text2);
		    a3.sendKeys("Mohan");
		    a3.accept();
		   
	}

}
