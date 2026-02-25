package com.newgen.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 

		// Maximize browser window
		driver.manage().window().maximize();
		
		driver.get("https://www.zoom.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("zdcm-main-nav__megamenu-trigger")));
		                                                                                         
		element.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
