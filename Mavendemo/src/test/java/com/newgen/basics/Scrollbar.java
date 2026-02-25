package com.newgen.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Upcasting

		// Maximize browser window
		driver.manage().window().maximize();
		
	  //  driver.get("https://www.google.com");
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    js.executeScript("window.scrollBy(400,0)"); //down
	    
	    Thread.sleep(5000);
	    
	    js.executeScript("window.scrollBy(-300,0)"); //up
	    
	    Thread.sleep(5000);
	    
	    driver.quit();

	}

}
