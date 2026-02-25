package com.newgen.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']/parent::a")).click();
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']/ancestor::div[2]")).click();
		
		//driver.findElement(By.xpath("//input[@id='name']/ancestor-or-self::input")).sendKeys("Seema1");
		
		//driver.findElement(By.xpath("//input[@id='name']/preceding-sibling::legend[1])"));

		//driver.findElement(By.xpath("//input[@id='name']/preceding::div[3][@type='checkbox'][1]\")).click();"));
		
		driver.findElement(By.xpath("//input[@id='name']/following::div[8]")).click();
		
	
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
