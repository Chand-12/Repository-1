package com.newgen.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    js.executeScript("window.scrollBy(0,1000)"); //down
	    
	    Thread.sleep(5000);
		
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	//	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"commonWebElements\"]/p[4]")));
		 
	    
	    WebElement element = driver.findElement(By.id("male"));
		if(element.isDisplayed()){
			System.out.println("element is displayed");
			element.click();
		}else {
			System.out.println("element is not displayed");
		}
		Thread.sleep(3000);
		
		if(element.isSelected()){
			System.out.println("element is Selected");
			//element.click();
		}else {
			System.out.println("element is not Selected");
		}
		Thread.sleep(3000);
		
		 WebElement element2 = driver.findElement(By.id("female"));
		if(element2.isEnabled()){
			System.out.println("element is enabled");
		}else {
			System.out.println("element is disabled");
		}
		
		//checkbox
		
//		WebElement element3 = driver.findElement(By.className("Automation"));
//		element3.click();
//		
//		
//		if(element3.isSelected()){
//			System.out.println("checkbox is selected");
//			//element3.click();
//		}else {
//			System.out.println("checkbox is not selected");
//		}
		
		List<WebElement> checkboxes =
		        driver.findElements(By.xpath("//input[@type=\'checkbox\']"));
		
		checkboxes.get(0).click();
		Thread.sleep(3000);
	    checkboxes.get(1).click();
		
//		for(WebElement checkbox : checkboxes) {
//			if(!checkbox.isSelected()) {
//				checkbox.isSelected();
//			}
	
	//	}
		
		Thread.sleep(3000);
		
		

		driver.quit();

	}

}
