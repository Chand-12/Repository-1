package com.newgen.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Upcasting

		// Maximize browser window
		driver.manage().window().maximize();
		
	    driver.get("https://www.irctc.co.in/nget/train-search");
   WebElement ele = driver.findElement(By.xpath("//span [@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c76-10 pi pi-chevron-down\"]"));
	    ele.click();
	    
	   Select select = new Select(ele);
		// WebElement ele2 = driver.findElement(By.xpath("//span[text()='Vistadome AC (EV)']"));
	    //ele2.click();
	    select.selectByValue("2");
	    
	    
	    
	    
	    
	  
	    Thread.sleep(5000);
	    
	    driver.quit();
	    
	    
	    
	    
	    
		

	}

}
