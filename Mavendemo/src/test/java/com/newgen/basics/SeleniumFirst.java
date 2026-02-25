package com.newgen.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// 2. Launch Chrome browser
		WebDriver driver = new ChromeDriver(); // Upcasting

		// Maximize browser window
		driver.manage().window().maximize();

		// Delete all cookies (fresh session)
		driver.manage().deleteAllCookies();

		// Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 3. Open URL
		driver.get("https://www.google.com");

		// 4. Get and print title
		//System.out.println("Title is: " + driver.getTitle());

		//driver.navigate().to("https://www.google.com");
		Thread.sleep(Duration.ofSeconds(2));
//
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(Duration.ofSeconds(2));
//
		WebElement user = driver.findElement(By.name("username"));
//
	user.sendKeys("Chanda123");
//
//		WebElement pwd = driver.findElement(By.name("password"));
//
//		pwd.sendKeys("123456");
//
//		//driver.navigate().back();
//
//		//driver.findElement(By.linkText("Register")).click();
//
//		//driver.navigate().back();
//
//		driver.findElement(By.partialLinkText("Forgot")).click();

		//driver.navigate().back();
	//Thread.sleep(Duration.ofSeconds(2));
//		
//		List<WebElement>inputtext = driver.findElements(By.tagName("input"));
//		
//		inputtext.size();
//		
//		System.out.println(+inputtext.size());
//		
//		List<WebElement>Link= driver.findElements(By.tagName("a"));
//		
//		System.out.println(+Link.size());
//		
//		//driver.findElement(By.cssSelector("ntp-iframe#oneGoogleBar")); 
	
	//driver.get("https://www.google.com");
	
	//Thread.sleep(Duration.ofSeconds(2));
		
//		driver.findElement(By.cssSelector("a.gb_Z")).click(); 
	//	Thread.sleep(Duration.ofSeconds(2));
		
		//driver.navigate().back();
		
		//driver.findElement(By.cssSelector("cr-searchbox-icon#icon")).click(); 
		
		//Thread.sleep(5000);
		
	  //driver.findElement(By.cssSelector("a.gb_Z[aria-label=Gmail]"));
	  //Thread.sleep(5000);

//		driver.navigate().forward();
//		Thread.sleep(Duration.ofSeconds(10));
//
//		driver.navigate().refresh();
//		Thread.sleep(Duration.ofSeconds(10));
//		
//		String actTitle = driver.getTitle();
//		String expTitle = "https://www.selenium.dev/downloads/";
//		
//		if(expTitle.equals(actTitle)) {
//			System.out.println("test case passed: Title is correct");
//		}else {
//			System.out.println("test case failed: Title is incorrect");
//		}
//
//		String actURL = driver.getCurrentUrl();
//		String expURL = "https://www.selenium.dev/downloads/";
//		
//		if(expURL.equals(actURL)){
//			System.out.println("test case passed: URL is correct");
//		}else {
//			System.out.println("test case failed: URL is incorrect");
//		}
//		
//		String pgSource = driver.getPageSource();
//		if(pgSource.contains("Selenium logo green")) {
//			System.out.println("Webpage loaded is correct");
//		}
//		
//		System.out.println(pgSource);

		// 5. Close browser
		driver.quit();
	}
}
