package com.newgen.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		//driver.get("https://accounts.google.com/");
		
		// Maximize browser window
				driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
				
				//css selector
		
//		WebElement user = driver.findElement(By.cssSelector("input.input[name=username]")); //tagname.classname[attribute=value]
//        user.sendKeys("Seema");
//        
//        WebElement pwd = driver.findElement(By.cssSelector("input[type=password]")); //tagname[attribute=value]
//        pwd.sendKeys("Seema1");
//        
//
//        WebElement pwd2 = driver.findElement(By.cssSelector("#lastName"));  //Tag And ID by using #
//        pwd2.sendKeys("Seema1");
//        
		
		//XPath
		
//	WebElement element =  driver.findElement(By.xpath("//a[@aria-label='Gmail ']")); //xpth //tagname[@attribute='value']
//        
//       element.click();
//       
//      driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail ')]"));  //tagname[contains(@attribute,'value')]
//        
    // driver.get("https://parabank.parasoft.com/parabank/lookup.htm"); 
//		
//      WebElement user = driver.findElement(By.xpath("//input[contains(@id,'firstName')]")); //tagname[contains(@id,'value')]
//      
//      WebElement ele = driver.findElement(By.xpath("//input[contains(@id,'firstName') and  contains(@name,'firstName')]"));
//      ele.sendKeys("chand");
//    //tagname[contains(@id,'value')and contains(@name,'value')]
//      
     //driver.findElement(By.xpath("//input[contains(@class,'input') and contains(@name,'username')]")).sendKeys("prisha");
      
      ///  driver.findElement(By.xpath(""))
    //  user.sendKeys("cat");
      //Thread.sleep(5000);
      
         //chaining
     //driver.findElement(By.xpath("//div[@class='login'] //input[@name='username']")).sendKeys("chandu");
 //Thread.sleep(5000);
 
 
//starts-with 
 
// driver.findElement(By.xpath("//textarea[starts-with(@id,'APjFqb')]")).sendKeys("iphone17");
// Thread.sleep(5000);
// driver.findElement(By.xpath("//textarea[starts-with(@id,'APjFqb')and contains(@name,'q')]")).sendKeys("iphone17");
// Thread.sleep(5000);

 //text()
 
// driver.findElement(By.xpath("//a[text()='Register']")).click();
// Thread.sleep(5000);
// 
// driver.findElement(By.xpath("//h2[text()='Customer Login']")).click();
// Thread.sleep(5000);
// 
// driver.findElement(By.xpath("//a[text()='Forgot login info?']")).click();
// Thread.sleep(5000);
//driver.findElement(By.xpath("//*[(text()='Create account')and(@class='VfPpkd-vQzf8d')]")).click();
//Thread.sleep(5000);

//driver.findElement(By.xpath("//form[@name='login']//input[@type='text' and @name='username']")).sendKeys("shekhar");
//Thread.sleep(5000);
        
        
  //driver.findElements(By.xpath("//form[@name='login']/descendant-or-self::form"));
		
 //WebElement user = driver.findElement(By.xpath("//input[@id='firstName' and @name='firstName']/parent::td"));
		
//WebElement user = driver.findElement(By.xpath("//input[@id='firstName' and @name='firstName']/preceding::input[3]"));
//user.click();

 //user.sendKeys("chand");
 Thread.sleep(5000);
 
  driver.quit();
    
        

	}

}
