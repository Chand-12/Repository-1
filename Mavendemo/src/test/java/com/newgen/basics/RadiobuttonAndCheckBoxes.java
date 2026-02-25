//package com.newgen.basics;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class RadiobuttonAndCheckBoxes {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://demoqa.com/radio-button");
//		
//		driver.findElement(By.xpath("//[text()='Radio Button'])")).click();
//		
//		//checking of button displaying
//		
//		WebElement Buttondisplay = driver.findElement(By.xpath("//input[@id='yesRadio'])"));
//		
//		if(Buttondisplay.isDisplayed()){
//			System.out.println("Button is displayed");
//			Buttondisplay.click();
//		}else {
//			System.out.println("Button is not displayed");
//		}
//		
//		//checking of button selection
//		WebElement Buttoncheck = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
//		
//		if(Buttoncheck.isSelected()) {
//			System.out.println("Button is selected");
//		}else {
//			System.out.println("Button is not selected");
//			Buttoncheck.click();
//		}
//		
//		//checking of button enabled or disabled
//		
//		WebElement Button = driver.findElement(By.xpath("//input[@id='noRadio'])"));
//		if(Button.isEnabled()) {
//			System.out.println("Button is enabled");
//		}else {
//			System.out.println("Button is not enabled");
//		}
//		
//		//click on checkbox
//		driver.findElement(By.xpath("//span[text()='Check Box'])")).click();
//		
//		//checking of checkbox is selected or not
//		
//		WebElement checkbox = driver.findElement(By.xpath("//input[@class='rct-checkbox'])"));
//		
//		if(checkbox.isSelected()) {
//			System.out.println("checkbox is selected");
//		}else {
//			System.out.println("checkbox is not selected");
//		}
//		
//		driver.quit();
//		
//	}
//
//}

package com.newgen.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonAndCheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ================= RADIO BUTTON =================
        driver.get("https://demoqa.com/radio-button");

        // Click YES radio button (click label)
        driver.findElement(By.xpath("//label[text()='Yes']")).click();

        WebElement yesRadio = driver.findElement(By.id("yesRadio"));

        // Displayed
        System.out.println("Yes displayed: " + yesRadio.isDisplayed());

        // Selected
        System.out.println("Yes selected: " + yesRadio.isSelected());

        // Enabled
        System.out.println("Yes enabled: " + yesRadio.isEnabled());

        Thread.sleep(2000);

        // ================= CHECKBOX =================
        driver.get("https://demoqa.com/checkbox");

        // Expand all
        driver.findElement(By.xpath("//button[@title='Expand all']")).click();
        Thread.sleep(2000);

        // Click Desktop checkbox (click label)
        driver.findElement(By.xpath("//span[text()='Desktop']")).click();

        WebElement desktopCheckbox =
                driver.findElement(By.id("tree-node-desktop"));

        // Check selected
        if (desktopCheckbox.isSelected()) {
            System.out.println("Desktop checkbox is selected");
        } else {
            System.out.println("Desktop checkbox is not selected");
        }

        driver.quit();
    }
}

