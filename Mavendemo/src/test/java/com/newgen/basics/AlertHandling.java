package com.newgen.basics;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://www.google.com/");
		driver.get("https://www.irctc.co.in/nget/train-search");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn btn-primary\"")));
//		
//		
//		
   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn btn-primary\"")));
	
   driver.switchTo().alert().accept();
//		
//		//js alert		
	  //  Alert alert = driver.switchTo().alert();
//
		//System.out.println(alert.getText()); // read alert text		
		//Thread.sleep(5000);
//
	//	alert.accept(); // click OK
//		
	    Thread.sleep(5000);
//	
		//confirmation alert

//  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//
//	Alert alert2 = driver.switchTo().alert();
//	
//	Thread.sleep(5000);
//	
//	alert2.dismiss();
//	
//	Thread.sleep(5000);
	
////		//prompt alert
	
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//	
//	Alert alert3 = driver.switchTo().alert();
//		
//		alert3.sendKeys("Chand");
//	Thread.sleep(5000);
//		
//		alert3.accept();
//		Thread.sleep(5000);
//		
		
		driver.quit();
		

	}

}
