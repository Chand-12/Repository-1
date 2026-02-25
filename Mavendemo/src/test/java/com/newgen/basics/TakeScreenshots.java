package com.newgen.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots {



	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//whole page ss
		
		WebDriver driver = new ChromeDriver(); 
		
		
	    driver.get("https://www.google.com");
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//		File src =ts.getScreenshotAs(OutputType.FILE);
//		
//		File dest  = new File(".//Screenshots//HomePage.png");
//		
//	
//		 FileUtils.copyFile(src, dest);
//		 
		 
		 //ss of portion of page or section of page
		 
	     WebElement section = driver.findElement(By.xpath("//div[@id='rightPanel']"));
		 
		 File src1 = section.getScreenshotAs(OutputType.FILE);
		 
		 int count = 1;
	 
	 File dest1 = new File(".//Screenshots//rightpanel"+count+".png");
	 count++;
		 
		 FileUtils.copyFile(src1, dest1);
		 
		 //ss of element of page
		 
//        WebElement ele = driver.findElement(By.xpath("//a[text()='contact']"));
//		 
//		 File src1 = ele.getScreenshotAs(OutputType.FILE);
//		 
//		 File dest1 = new File(".//Screenshots//contact.png");
//		 
//		 FileUtils.copyFile(src1, dest1);
//		 
//		 
//		 
     	 Thread.sleep(5000);
		 
		 driver.quit();
	


	}

}
