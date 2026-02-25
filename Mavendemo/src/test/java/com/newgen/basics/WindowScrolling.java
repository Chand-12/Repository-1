package com.newgen.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Upcasting

		// Maximize browser window
		driver.manage().window().maximize();
		
	    driver.get("https://www.google.com");
	    WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	    
	    ele.sendKeys("RatanTata" +Keys.ENTER);
	    Thread.sleep(30000);
	   // driver.findElement(By.id("captcha")).sendKeys("1234");
	    
//       JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//	    js.executeScript("window.scrollBy(0,1200)"); //down
//	    
//	    Thread.sleep(300);
	    
	    //for particular element 
	    
//	    WebElement element = driver.findElement(By.xpath("//span[text()='More short videos']"));
//	    element.click();
//	    
//	    Thread.sleep(3000);
//
//	    JavascriptExecutor js2 = (JavascriptExecutor)driver;
//
//	    js2.executeScript("arguments[0].scrollIntoView(true);", element);
//	    
	    
	  //  WebElement element = driver.findElement(By.xpath("//span[text()='More short videos']"));
  //  element.click();
    
  //  Thread.sleep(3000);

	    JavascriptExecutor js3 = (JavascriptExecutor)driver;
	    
	    js3.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //down
	    
	    WebElement element = driver.findElement(By.xpath("//a[text()='Help']"));
	      element.click();
	      
	    
	    Thread.sleep(300);
	    
	    
	    
		
	    driver.quit();


	}

}
